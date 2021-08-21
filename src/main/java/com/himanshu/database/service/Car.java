package com.himanshu.database.service;

import org.springframework.stereotype.Service;

@Service
public class Car implements Vehicle {
	
	private int id;

	@Override
	public void vehicleName() {
		// TODO Auto-generated method stub
		System.out.println("Car method being used and the id is   "+ this.id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
