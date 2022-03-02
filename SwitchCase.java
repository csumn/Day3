package com.bridgelabs;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int attend = 1;
		int wagePerHour = 20;
		int fullTime = 8;
		int partTime = 4; 
		double value = Math.floor(Math.random()* 10) % 2;
		
		if(value == attend) {
		 System.out.println("Employee is Present");
		 System.out.println("select any option below ");
		 System.out.println("Full time - 1 or Part time -2 ");
		 Scanner sc = new Scanner (System.in);
		 int n = sc.nextInt();
		 sc.close();
		 
		switch(n)
		{
		case 1: System.out.println("Employee Wage is: " +wagePerHour*fullTime);
		break;
		case 2:	System.out.println("Employee Wage is: " +wagePerHour*partTime);
		break;
		default:
		System.out.println("Incorrect Entry");
		}
	}
		else 
		System.out.println("Absent");
	}
}
