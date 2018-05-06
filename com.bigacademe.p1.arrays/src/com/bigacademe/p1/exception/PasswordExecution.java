package com.bigacademe.p1.exception;
import java.util.Scanner;
public class PasswordExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
		String password= sc.nextLine();
		CheckPassword cp=new CheckPassword();
		try {
		cp.validatePassword(password);
		}
		catch(PasswordException pe) {
			System.out.println("Enter the password more than 6 characters");
			
		}finally {
			System.out.println("End");
		}
		

	}

}
