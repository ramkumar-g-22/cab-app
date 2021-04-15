package com.ramkumar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class BookingCab {
	static LocalDate journeyDate;
	static Scanner scanner = new Scanner(System.in);
	static LocalTime pickUpTime;
	
	public static LocalDate getJourneyDate() {
		System.out.print("Enter Journey Date : ");
		String date = scanner.next();
		journeyDate = LocalDate.parse(date);
		return journeyDate;
	}
	
	public static LocalTime getPickUpTime() {
		System.out.print("Enter PickUp Time : ");
		String time = scanner.next();
		pickUpTime = LocalTime.parse(time);
		return pickUpTime;
	}
}
