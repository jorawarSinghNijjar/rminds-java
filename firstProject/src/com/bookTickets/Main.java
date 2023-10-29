package com.bookTickets;

public class Main {

	public static void main(String[] args) {
		
		TicketCounter tc = new TicketCounter();
		
		TicketThread t1 = new TicketThread(tc, "John", 0);
		TicketThread t3 = new TicketThread(tc, "Jenny", 2);
		TicketThread t2 = new TicketThread(tc, "Bob", 2);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
