package com.bigacademe.p1.arraypractise;

import java.util.Scanner;

public class Ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ascending[]= new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in the array ");
		
		for(int i=0;i<ascending.length;i++) {
			ascending[i]=sc.nextInt();
		}
		
		findAscending(ascending);
	}
	
	public static void findAscending(int []ascending) {
		int temp=0;
		for(int i=0;i<ascending.length;i++) {
			
			for(int j=i+1;j<ascending.length;j++) {
				
			
				if(ascending[i]>ascending[j]) {
					temp=ascending[i];
					ascending[i]=ascending[j];
					ascending[j]=temp;
					
					}
				
				else if(ascending[i]<ascending[j]){
					temp=ascending[i];
					ascending[i]=ascending[j];
					ascending[j]=temp;
					
				}
				
				

	}
		

}
		for(int i=0;i<ascending.length;i++) {
			
			System.out.println("The elements in the descending order are "+ascending[i]);
		}
		
		System.out.println("The largest element in the array is"+ascending[ascending.length-1] );// to find the smallest and largest element.
		
		
		
}

	
}
