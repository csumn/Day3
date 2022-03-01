package com.bridgelabs;

public class PartTimeEmpWage {
	public static void main(String[] args) {
		int isPresent = 1;
		int wagePerHour = 20;
		int partTime = 4; 
		double value = Math.floor(Math.random()* 10) % 2;
		if(value == isPresent) {
		System.out.println("Employee is Present");
		System.out.println("Part Employee Daily Wage is: USD " +wagePerHour*partTime);
		}
		else 
		System.out.println("Employee is Absent");
	}
}
