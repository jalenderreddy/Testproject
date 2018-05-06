package com.bigacademe.p1.arraypractise;

import java.util.Scanner;

public class ReverseElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int reverse[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in the array ");
		
		for(int i=0;i<reverse.length;i++) {
			reverse[i]=sc.nextInt();
		}
		
		printReverse(reverse);
		
	}
	
	public static void printReverse(int []reverse) {
		
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.println("The elements in the reverse order are "+reverse[i]);
		}
		
	}

}
