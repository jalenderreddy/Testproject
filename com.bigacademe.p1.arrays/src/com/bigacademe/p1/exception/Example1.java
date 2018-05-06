package com.bigacademe.p1.exception;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");


try {
String s1=sc.nextLine();
String s2=sc.nextLine();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int []d=new int[2];
d[3]=7;
int c=a/b;
System.out.println(c);	
			
	}
catch(ArithmeticException ae) {
	System.out.println("dont enter zero in second place");
}catch(NumberFormatException ne) {
	System.out.println("Dont enter alphanumeric in string ");
}catch(Exception ae) {
	ae.printStackTrace();
}
finally {
	System.out.println("End");
}
}
}
