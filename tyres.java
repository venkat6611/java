package com.venkat.java;
import org.springframework.stereotype.Component;

@Component
public class tyres 
{
	public tyres() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String tyrebrand;

	public tyres(String tyrebrand) {
		super();
		this.tyrebrand = tyrebrand;
	}

	public String getTyrebrand() {
		return tyrebrand;
	}

	public void setTyrebrand(String tyrebrand) {
		this.tyrebrand = tyrebrand;
	}

	@Override
	public String toString() {
		return "tyres [tyrebrand=" + tyrebrand + "]";
	}
	
	}