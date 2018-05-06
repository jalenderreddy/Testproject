package com.bigacademe.p1.arraypractise;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []sum=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in the array ");
		
		for(int i=0;i<sum.length;i++) {
			sum[i]=sc.nextInt();
		}
		
		findSum(sum);
		
	}
	
	public static void findSum(int []sum) {
		int add=0;
		for(int i=0;i<sum.length;i++) {
			add=add+sum[i];
		}
		System.out.println("The sum of elements in an array is"+add);
	}

}
