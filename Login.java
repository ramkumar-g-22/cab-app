package com.ramkumar;

import java.util.Scanner;

public class Login {
	long mobileNumber;
	String password;
	Scanner scanner = new Scanner(System.in);
	public long getMobileNumber() {
		System.out.print("Enter you Mobile Number : ");
		mobileNumber = scanner.nextLong();
//		System.out.println(mobileNumber);
		validateMobileNumber();
		return mobileNumber;
	}
	public String getPassword() {
		System.out.print("Enter you Password : ");
		password = scanner.next();
//		System.out.println(password);
		validatePassword();
		//scanner.close();
		return password;
	}
	private boolean validatePassword() {
		// TODO Auto-generated method stub
		if(password.length() != 8) {
			System.out.println("Password must be 8 characters.");
			getPassword();
			return false;
		}
		return true;
	}
	public boolean validateMobileNumber() {
		String mobileNumberString = String.valueOf(mobileNumber);
		if(mobileNumberString.length() != 10 || mobileNumberString.length() > 10 || mobileNumberString.length() <= 0 ) {
			System.out.println("Please Enter valid mobile number");
			getMobileNumber();
			return false;
		}
		return true;
	}
}
