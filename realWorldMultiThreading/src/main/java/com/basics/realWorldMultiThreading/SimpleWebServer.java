package com.basics.realWorldMultiThreading;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
    public static void main(String[] args) {
        final int port = 8080;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread clientThread = new Thread(() -> handleClientRequest(clientSocket));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClientRequest(Socket clientSocket) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read the HTTP request from the client
            String request;
            while ((request = in.readLine()) != null) {
                if (request.isEmpty()) {
                    break; // End of request
                }
                System.out.println("Received client request: " + request);
            }

            // Send an HTTP response back to the client
            String response = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\nHello, World From SimpleWebServer!";
            out.println(response);

            // Close the connection
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
