package com.bigacademe.handsforjava.basics;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.empno=100;
		e1.empname="raju";
		e1.empsal=50000;
		e2.empno=200;
		e2.empname="ravi";
		e2.empsal=70000;
		e1.displayInfo();
		e2.displayInfo();
		Employee.displayOfficeAddress();
		}
}
