package com.bigacademe.p1.arraypractise;

import java.util.Scanner;

public class Elementsduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int duplicate[]=new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in the array ");
		
		for(int i=0;i<duplicate.length;i++) {
			duplicate[i]=sc.nextInt();
		}
		
		findDuplicate(duplicate);

	}
	
	public static void findDuplicate(int []duplicate) {
		
		for(int i=0;i<duplicate.length;i++) {
			
			for(int j=i+1;j<duplicate.length;j++) {
				
				if(duplicate[i]==duplicate[j]) {
					System.out.println("The duplicate elements in the array are"+duplicate[j]);
				}
				
			}
		}
		
		
	

}
}
