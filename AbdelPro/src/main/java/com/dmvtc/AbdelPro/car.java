package com.dmvtc.AbdelPro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class car implements Vehicle {
	@Autowired
	private Tires tire;
	
	public Tires getTire() {
		return tire;
	}

	public void setTire(Tires tire) {
		this.tire = tire;
	}

	public void drive() {
		
		System.out.println(" car is using : " + tire);
	}

}
