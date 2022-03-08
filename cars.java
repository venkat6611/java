package com.venkat.java;
import org.springframework.stereotype.Component;


@Component
public class cars 
{

	private String brand;
	
	public cars() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cars(String brand, color color, tyres tyre) {
		super();
		this.brand = brand;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "cars [brand=" + brand + "]";
	}
}