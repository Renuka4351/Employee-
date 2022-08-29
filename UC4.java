package com.bl.emp;

public class UC4 {

	
		// TODO Auto-generated method stub
		static final int ISPARTTIME = 1;
		static final int ISFULLTIME = 2;
		static final int EMPRATEPERHOUR = 20;
		

		public static void main(String[] args) {
			int empHour = 0;
			int empWage = 0;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case  ISPARTTIME:
					empHour = 4;
					break;
				case ISFULLTIME :
					empWage = 8;
					break;
				default:
					empHour = 0;
					
			}
			empWage = empHour * EMPRATEPERHOUR;
			System.out.println("Emp Wage: " +empWage);
	}

}
