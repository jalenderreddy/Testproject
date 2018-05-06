package com.bigacademe.p1.array1;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Scanner sc = new Scanner(System.in);
	int a[]= new int[5];
	
	int sum;
	sum=0;
	
	
	
	System.out.println("enter the elements of the array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		sum=sum+a[i];
		
		
	}
	System.out.println("total sum"+sum);
	
	}
}

	

	


