package com.ramkumar;

import java.util.Scanner;

public class PriceEstimator {
	private final int amountPerKilometerForMicroCab = 10;
	private final int amountPerKilometerForMiniCab = 15;
	private final int amountPerKilometerForPrimeCab = 20;
	private final int micro = 1;
	private final int mini = 2;
	private final int prime = 3;
	private int cabType;
	private int kilometer;
	private int totalAmount;
	Scanner scanner = new Scanner(System.in);


	/**
	 * This method get the cab type from the user.
	 */
	public void getCabType() {
		System.out.print("Enter Cab Type : ");
//		String choice = scanner.nextLine();
//		cabType = Integer.parseInt(choice);
		cabType = scanner.nextInt();
		validatingCabType(cabType);
	}

	/**
	 * Gets the kilometer from the user.
	 * 
	 * @return kilometer
	 */
	public int getKilometer() {
		System.out.print("How many kilometer you wanna go : ");
		kilometer = scanner.nextInt();
		return kilometer;
	}

	public int calculateBill() {
		switch (cabType) {
			case micro:
				totalAmount = calculateTotalAmount(amountPerKilometerForMicroCab);
				break;
			case mini:
				totalAmount = calculateTotalAmount(amountPerKilometerForMiniCab);
				break;
			case prime:
				totalAmount = calculateTotalAmount(amountPerKilometerForPrimeCab);
				break;
			default:
				break;
		}
		return totalAmount;
	}
	
	/**
	 * Calculating the total amount for all cabs.
	 * @param amountPerKilometer
	 * @return amount
	 */
	private int calculateTotalAmount(int amountPerKilometer) {
		int totalAmount = amountPerKilometer * kilometer;
		return totalAmount;
	}


	/**
	 * This method validate the cab type. If the car type is small, it will
	 * calculate amount for small car with calculateAmountForSmallCar() function.
	 * Else if the car type is big, it will calculate amount for big car with
	 * calculateAmountForBigCar() function. Otherwise calls the getCarType()
	 * function.
	 * 
	 * @param carType
	 */
	private boolean validatingCabType(int cabType) {
		if (cabType == micro) {
			System.out.println("You have Chosen Micro Cab");
			return true;
		} else if (cabType == mini) {
			System.out.println("You have Chosen Mini Cab");
			return true;
		} else if (cabType == prime) {
			System.out.println("You have Chosen Prime Cab");
			return true;
		} else {
			System.out.println("Invalid Cab Type. Please enter valid Cab Type");
			getCabType();
			return false;
		}
	}
	
	public void displayBill() {
		System.out.println("Your Total Bill : " + totalAmount);
	}

}
