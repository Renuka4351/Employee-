package com.bl.emp;

public class UC6 {

	
		static final int isparttime = 1;
		static final int isfulltime = 2;
		static final int emprateper = 20;
		static final int numofworking = 20;
		static final int maxhrsinmonth = 100;

		public static void main(String[] args) {
				int empHour = 0;
				int totalWorkingDays = 0;
				int totalEmpHour = 0;
				while (totalEmpHour <= maxhrsinmonth && totalWorkingDays < numofworking) {
						totalWorkingDays++;
						int empCheck = (int) Math.floor(Math.random() * 10) % 3;

						switch (empCheck) {
								case isparttime:
										empHour = 4;
										break;
								case isfulltime:
										empHour = 8;
										break;
								default:
										empHour = 0;

						}
						totalEmpHour += empHour;
						System.out.println("Day#" + totalWorkingDays + ": empHour; " + empHour);
				}

				//				private int totalEmpHour;

				int totalEmpWage = totalEmpHour * emprateper;
				System.out.println("Total Emp Wage: " + totalEmpWage);
	}

}
