package com.gautam.demoProject;

import org.springframework.stereotype.Component;

@Component
public class Jeep implements Vehicle{
	public void drive() {
		System.out.println("Bhaag rahi hai");
	}
}
