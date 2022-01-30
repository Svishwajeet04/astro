package com.example.demo.entities.enums;

public enum BedType {
	
	GENERAL(500) , ICU(2000) , SPECIAL(1000) ;  
	
	public final int price;
	
	private BedType(int k) {
		this.price = k;
	}
	
	public int getPrice() {
		return this.price;
	}

}
