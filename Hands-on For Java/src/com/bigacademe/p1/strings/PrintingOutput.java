package com.bigacademe.p1.strings;

import java.util.Scanner;

public class PrintingOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"Tn_Chennai","Karnataka_Bangalore"};
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter the state: ");
		String input2=sc.nextLine();
		boolean isFind=false;
		for(int i=0;i<arr.length;i++) {
			String s[]=arr[i].split("_");
			if(s[0].equals(input2)) {
				System.out.println("The output is"+s[1]);
				isFind=true;
				break;
				
			}
		}
		if(!isFind)	{
			System.out.println("the given state is not there");
		}
	}
	
}


