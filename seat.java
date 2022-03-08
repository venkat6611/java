package com.venkat.java;

import org.springframework.stereotype.Component;

@Component
public class seat 
{
	private  String seat;

	public seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "seat [seat=" + seat + "]";
	}
	


}