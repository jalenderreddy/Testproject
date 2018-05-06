package com.bigacademe.p1.arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[];
int size;
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of the array");
size = sc.nextInt();

a= new int[size];
Random r = new Random();
for(int i=0; i<a.length; i++) {
	a[i] = r.nextInt(10);


	}
for(int i=0; i<a.length; i++) {
	System.out.println(a[i]);
}
System.out.println("enter the size of the array");
size = sc.nextInt();

a=new int[size];

	}
}
