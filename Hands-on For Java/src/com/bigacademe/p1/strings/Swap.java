package com.bigacademe.p1.strings;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter line of text.");
		        
		        String input1 = sc.nextLine();
		        char firstchar=input1.charAt(0);
		        char lastchar=input1.charAt(input1.length()-1);
		        StringBuffer sb=new StringBuffer(input1);         //helloworld.
		        sb.replace(0, 1, lastchar+"");
		        sb.replace(sb.length()-1, sb.length(), firstchar+" ");
		        System.out.println(sb);

		        String result=sb.toString();// if we want to convert again this stringbuffer to a string.
		        System.out.println(result);
	}

}
