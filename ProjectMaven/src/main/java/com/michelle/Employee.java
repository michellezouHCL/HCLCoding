package com.michelle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	
	/*
	 * How do you use Lombok to satisfy the following condition?
	 * "If monthlySalary is not positive, do not set its value"
	 */
}
