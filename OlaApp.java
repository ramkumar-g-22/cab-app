package com.ramkumar;

import java.time.LocalTime;

public class OlaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login();
		login.getMobileNumber();
		login.getPassword();

		CabType cabType = new CabType();
		cabType.displayCabType();

		PriceEstimator priceEstimator = new PriceEstimator();
		priceEstimator.getCabType();
		priceEstimator.getKilometer();
		int amount = priceEstimator.calculateBill();
//		System.out.println("Amount : " + amount);
		priceEstimator.displayBill();

		CalculateGST calculateGST = new CalculateGST();
		double totalAmount = calculateGST.calculateGST(amount);
		calculateGST.displayBillWithGST();
		
		BookingCab.getJourneyDate();
		LocalTime pickUpTime = BookingCab.getPickUpTime();
//		System.out.println(pickUpTime);
		
		PeakTime peakTime = new PeakTime();
		peakTime.calculateAmountAtPeakTime(pickUpTime, totalAmount);
		peakTime.displayBillAtPeakTime();
		
		SeniorCitizen seniorCitizen = new SeniorCitizen(amount);
		SeniorCitizen.getDateOfBirth();
	}
}