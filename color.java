package com.venkat.java;
import org.springframework.stereotype.Component;

@Component
public class color 
{
	private String color;

	public color() {
		super();
		// TODO Auto-generated constructor stub
	}

	public color(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "color [color=" + color + "]";
	}


	}
