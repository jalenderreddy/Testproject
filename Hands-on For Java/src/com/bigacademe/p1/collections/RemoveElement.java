package com.bigacademe.p1.collections;
import java.util.Scanner;
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int array[]=new int[100];
		int position,c,n;
		
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		System.out.println("Enter"+n+"elements");
		
		
		
		for(c=0;c<n;c++) {
			array[c]=sc.nextInt();
		}
		
		System.out.println("Enter the location of element to deleted");
		position=sc.nextInt();
		
		if(position>n+1) {
			System.out.println("no deletion");
		}
		
		else {
			
		
		for(c=position;c<n;c++) {
			array[c]=array[c+1];
		}
		
		System.out.println("The final array after deleting");
		
		for(c=0;c<n;c++) {
			System.out.println(" "+array[c]);
		}
		}
		
		
		
	}

}
