package com.bl.emp;

public class UC5 {

	
		// TODO Auto-generated method stub
		static final int ISPARTTIME = 1;
		static final int ISFULLTIME = 2;
		static final int EMPRATEPERHOUR = 20;
		static final int NUMOFWORKINGDAYS = 2;

		public static void main(String[] args) {
			int empHour = 0;
			int empWage = 0;
			int totalEmpWage = 0;
			for (int day = 0; day < NUMOFWORKINGDAYS; day++ ) {
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
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " +empWage);
		}
		System.out.println("Total Emp Wage: " +totalEmpWage);
	}

}
