package com.bigacademe.p1.exception;

import java.util.Scanner;

public class Example2 {

public static void displayAmount(int amount) throws ArithmeticException {
	if(amount<0) {
		ArithmeticException ae = new ArithmeticException("enter -ve values");
		throw ae;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		int a= sc.nextInt();
		try {
		displayAmount(a);
		}catch(ArithmeticException ae){
			System.out.println("dont enter -ve value");
			
		}

	}

}
