package com.bigacademe.p1.exception;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username and password");
		String username= sc.nextLine();
		String password= sc.nextLine();
		
		ValidateUser vs = new  ValidateUser();
		
		
		
		
		try {
			vs.checkUser(username, password);
			vs.checkUser(null, null);
			}
			
		catch(LoginException le) {
				System.out.println("username or password should not be null");	
				}
			
		finally {
				System.out.println("End");
	}
	}


		
		
	}


