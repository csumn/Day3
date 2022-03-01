package com.bridgelabs;

public class EmpAttendance {
	public static void main(String[] args) {
		int isPresent = 1;
		double value = Math.floor(Math.random()* 10) % 2;
		if(value == isPresent) {
		System.out.println("Emp is Present");
		}
		else 
		System.out.println("Emp is Absent");
	}
}
