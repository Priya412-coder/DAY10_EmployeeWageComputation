package com.employeewageuc11and13and14;

public class EmployeeWageDemo {
	public static void main(String[] args) {
		
		EmployeeWageComputation empWageBuilder = new EmployeeWageComputation("John");
		empWageBuilder.addCompany(new Company("Dmart", 8, 20, 20, 60));
		empWageBuilder.addCompany(new Company("RIL", 8, 20, 20, 60));
		empWageBuilder.addCompany(new Company("INFOSYS", 6, 40, 25, 100));
		empWageBuilder.addCompany(new Company("Wipro", 6, 40, 25, 100));
		empWageBuilder.addCompany(new Company("MSO", 6, 40, 25, 100));
		empWageBuilder.addCompany(new Company("AED", 9, 20, 16, 50));
		
		System.out.println(empWageBuilder.getCompany(2));
		
		System.out.println(empWageBuilder.getCompany("MSO"));
		
		System.out.println("\n---------------------\n"+empWageBuilder.getTotalWage("AED"));
	}
}
