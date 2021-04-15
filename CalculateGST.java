package com.ramkumar;

public class CalculateGST {
	private double totalAmount;
	private final double GST = 7;
	private double gstAmount;
	
	public double calculateGST(int amount) {
		gstAmount = amount * (GST / 100.0);
		totalAmount = amount + gstAmount;
		return totalAmount;
	}
	
	public void displayBillWithGST() {
		System.out.println("Your total bill with GST : " + totalAmount);
	}
}
