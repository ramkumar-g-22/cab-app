package com.ramkumar;

public class CabType {
	String cabTypes[] = {"Micro(Rs.10/km)", "Mini(Rs.15/km)", "Prime(Rs.20/km)"};
	public void displayCabType() {
		for (int cabType = 0; cabType < cabTypes.length; cabType++) {
			System.out.println((cabType + 1) + " - " + cabTypes[cabType]);
		}
	}
}
