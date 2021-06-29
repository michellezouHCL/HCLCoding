package com.michelle;

public class EmployeeTest {
	
	public static double raise(double monthlySalary, double percentageRaise) {
		
		return (percentageRaise*monthlySalary)+monthlySalary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setFirstName("Jane");
		emp1.setLastName("Doe");
		emp1.setMonthlySalary(6000);
		
		Employee emp2 = new Employee();
		emp2.setFirstName("Donald");
		emp2.setLastName("Trump");
		emp2.setMonthlySalary(1000000);
		
		System.out.println("Before 10% Raise:");
		System.out.printf("%s %s:%.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary());
		System.out.printf("%s %s:%.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary());
	
		//After 10% Raise
		System.out.println("\nAfter 10% Raise:");
		emp1.setMonthlySalary(raise(emp1.getMonthlySalary(), 0.1));
		emp2.setMonthlySalary(raise(emp2.getMonthlySalary(), 0.1));
		System.out.printf("%s %s:%.2f\n",emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary());
		System.out.printf("%s %s:%.2f\n",emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary());
	}

}
