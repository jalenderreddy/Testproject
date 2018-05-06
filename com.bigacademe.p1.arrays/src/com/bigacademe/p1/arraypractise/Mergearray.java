package com.bigacademe.p1.arraypractise;

public class Mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50};
		int b[]= {60,70,80,90,100};
		
		int c[]=new int[10];
		
		
		mergeDisplay( a, b, c);
		
		
	}
	
	public static void mergeDisplay(int a[],int b[],int c[]) {
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			c[i]=a[i];;
			count++;
			
		}
		
		for(int j=0;j<b.length;j++) {
			
			c[count++]=b[j];
			
			
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println("The elements in the C array is"+c[i]);
		}
			
		
		
	}
}
		



