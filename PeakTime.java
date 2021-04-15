package com.ramkumar;

import java.time.LocalTime;

public class PeakTime {
	private final double peakRate = 1.25;
	private double amountAtPeakTime;

	public double calculateAmountAtPeakTime(LocalTime pickUpTime, double totalAmount) {
		int hour = pickUpTime.getHour();
		if(hour >= 5 && hour <= 7) {
			amountAtPeakTime = totalAmount + ((totalAmount * peakRate) / 100);
			return amountAtPeakTime;
		}
		amountAtPeakTime = totalAmount;
		System.out.println("PeakRate : " + amountAtPeakTime);
		return totalAmount;
	}
	
	public void displayBillAtPeakTime() {
		System.out.println("Your total bill at peak time : " + amountAtPeakTime);
	}
}
