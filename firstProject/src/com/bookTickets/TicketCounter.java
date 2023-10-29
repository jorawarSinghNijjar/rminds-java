package com.bookTickets;

public class TicketCounter {
	
	private int availableSeats = 3;
	
	// Synchronized - a thread can only access this method if one thread has finished the method execution
	public synchronized void bookTickets(String passengerName, int numOfSeats) throws Exception {
		if(numOfSeats <= 0) {
			throw new Exception("Enter positive number of seats");
		}
		if(this.availableSeats >= numOfSeats) {
			System.out.println(passengerName + "'s Ticket booked successfully");
			this.availableSeats -= numOfSeats;
		}
		else {
			System.out.println("Seat not available");
		}
	}
}
