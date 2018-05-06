package com.bigacademe.p1.abstractclasses;

public class EmployeeExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeE1 obj;

		obj=new Programmer();
		obj.jobs();
		obj=new Analyst();
		obj.jobs();

		obj=new Manager();
		obj.jobs();
	}

}
