package com.bigacademe.p1.array1;

import java.util.Scanner;

public class Duplicate {

	
		public static void main(String[] args) {
			
			int a[]= new int[7];
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the elements in an array");
			
			for(int k=0;k<a.length;k++) {
			a[k]=sc.nextInt();
			
			}
			duplicateArray(a);
		}

			
			public static void duplicateArray(int []a) {
				
			for(int i=0;i<a.length;i++) {
				
				for(int j=i+1;j<a.length;j++) {
					
					
				if(a[i]==a[j]) {
						System.out.println("The array consists of duplicate values are"+a[j]);	
						
					}
				
					
					
					
	}
		

}
			 
				
			
}
}
