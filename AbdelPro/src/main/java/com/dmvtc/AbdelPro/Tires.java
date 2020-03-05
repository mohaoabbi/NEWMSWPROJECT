package com.dmvtc.AbdelPro;

import org.springframework.stereotype.Component;

@Component
public class Tires {
	
	private String brand;



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tires [brand=" + brand + "]";
	}

}
