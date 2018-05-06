package com.bigacademe.p1.exception;

public class TaxCalculator {
	
	
	
	public double  calculateTax( String empname,boolean isIndian,double empsal) throws CountryNotValidException , EmployeeNameInvalidException, TaxNotEligibleException{
		String employee = null;
		double taxamount = 0;
		if(employee!="indian")
		{
			System.out.println(" not an indian"); 
			CountryNotValidException cnve = new CountryNotValidException();
			throw cnve;
			
		}
		if(empname ==null&& empname==" ") {
			System.out.println(" Employee name is null or empty");
			EmployeeNameInvalidException enie = new EmployeeNameInvalidException();
			throw enie;
			
		} 
		if(empsal>=100000 && employee=="indian" ) {
			taxamount =empsal *8/100;
			System.out.println(taxamount);
		}
		else if(empsal>=50000 && empsal<=100000 &&employee=="indian") {
			taxamount =empsal *6/100;
			System.out.println(taxamount);
		
}
		else if(empsal>=30000 && empsal<=50000 &&employee=="indian") {
			taxamount =empsal *5/100;
			System.out.println(taxamount);	
			}
		
		else if(empsal>=10000 && empsal<=30000 &&employee=="indian") {
			taxamount =empsal *5/100;
			System.out.println(taxamount);	
			}
		
		else {
			System.out.println(" tax not eligible exception");
			TaxNotEligibleException tnee=new TaxNotEligibleException();
			throw tnee;
		}
		return taxamount;
		
}
}
