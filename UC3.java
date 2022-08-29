package com.bl.emp;

public class UC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ISPARTTIME = 1;
		int ISFULLTIME = 1;
		int EMPRATEPERHOUR = 20;
		int empHrs = 0;
		int empwage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == ISPARTTIME)
			empHrs = 5;
		else if (empCheck == ISFULLTIME)
			empHrs = 8;
		else
			empHrs = 0;
		empwage = empHrs * EMPRATEPERHOUR;
		System.out.println("Emp Wage: " +empwage);

	}

}
