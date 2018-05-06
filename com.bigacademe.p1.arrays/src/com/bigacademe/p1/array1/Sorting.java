package com.bigacademe.p1.array1;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[7];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements in an array");
		
		for(int k=0;k<a.length;k++) {
		a[k]=sc.nextInt();
		
		}
		
		sortingArray(a);
		
		
	}
	
	public static void sortingArray(int []a)
	{
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				
			if(a[i]<=a[j]) {
				//a[i]=a[j];
				System.out.println("The array is in ascending order "+a[i]);
					
				}
			else if(a[i]>=a[j]) {
				a[i]=a[j];
				a[j]=a[j]+1;
				System.out.println("The array is not in ascending order "+a[i]);
				
			}
			
				
				
}
	

}
		
		
		
}
}