package com.bigacademe.p1.strings;

public class NumberWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
		String s="i work in cognizant";
		String sb[]=s.split(" ");
		for(int i=0;i<sb.length;i++) {
			
			count++;//count=count+1;
			
			System.out.print(sb[i]+" ");
			
			
			
		}
		System.out.print("The total number of words in a string is ="+count);
	}

}
