package com.bigacademe.p1.exception;
import java.util.Scanner;
public class CalculatorSimulator {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the employee and empname and empsal");
String employee= sc.nextLine();
String empname= sc.nextLine();
double empsal=sc.nextDouble();	

TaxCalculator tc =new TaxCalculator();

try {
	try {
		try {
			tc.calculateTax(empname, true, empsal);
		} catch (TaxNotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("employee does not need to pay tax");
			
		}
	} catch (CountryNotValidException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("The employee should be an Indian citizen for calculating tax");
	}
} catch (EmployeeNameInvalidException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("The employee name cannot be empty");
	
}
String taxamount = null;
System.out.println("Tax amount is"+taxamount);
	}
	


}

	
