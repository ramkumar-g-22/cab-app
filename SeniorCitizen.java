package com.ramkumar;

import java.time.LocalDate;
import java.util.Scanner;

public class SeniorCitizen {
	static LocalDate dateOfBirth;
	static Scanner scanner = new Scanner(System.in);
	static LocalDate currentDate = LocalDate.now();
	static byte age;
	static double totalAmountForSeniorCitizen;
	static double offerForSeniorCitizen = 50;
	private static int amount;
	
	public SeniorCitizen(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}
	
	public static LocalDate getDateOfBirth() {
		System.out.print("Enter Your Date of Birth : ");
		String dob = scanner.next();
		dateOfBirth = LocalDate.parse(dob);
		calculateAge();
		return dateOfBirth;
	}
	
	private static byte calculateAge() {
		age = (byte) (currentDate.getYear() - dateOfBirth.getYear() );
//		System.out.println("Age : " + age);
		if (age > 60) {
			calculateOfferForSeniorCitizen();
			displayTotalForSeniorCitizen();
//			System.out.println("Amount : " + amount);
		}else {
			totalAmountForSeniorCitizen = amount;
			System.out.println("Total Amount : " + amount);
		}
		return age;
	}
	
	private static void calculateOfferForSeniorCitizen() {
		totalAmountForSeniorCitizen = (double) (amount * (offerForSeniorCitizen / 100));
	}
	
	public static void displayTotalForSeniorCitizen() {
		System.out.println("Total Amount for Senior Citizen : " + totalAmountForSeniorCitizen);
	}
}
