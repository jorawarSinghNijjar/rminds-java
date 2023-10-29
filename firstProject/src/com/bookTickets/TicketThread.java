package com.bookTickets;

public class TicketThread extends Thread{
	
	private TicketCounter tc;
	private String passengerName;
	private int numOfSeats;
	
	
	
	public TicketThread(TicketCounter tc, String passengerName, int numOfSeats) {
		this.tc = tc;
		this.passengerName = passengerName;
		this.numOfSeats = numOfSeats;
	}

	@Override
	public void run() {
		try {
			this.tc.bookTickets(this.passengerName, this.numOfSeats);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
