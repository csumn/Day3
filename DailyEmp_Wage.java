package com.bridgelabs;

public class DailyEmp_Wage {
	public static void main(String[] args) {
		int isPresent = 1;
		int wagePerHour = 20;
		int fullTime = 8;
		double value = Math.floor(Math.random()* 10) % 2;
		if(value == isPresent) {
		System.out.println("Employee is Present and ");
		System.out.println("Employee Daily Wage is: USD " +wagePerHour*fullTime);
		}
		else 
		System.out.println("Employee is Absent");
	}
}
 