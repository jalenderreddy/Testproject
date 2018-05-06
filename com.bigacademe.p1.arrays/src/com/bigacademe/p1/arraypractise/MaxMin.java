package com.bigacademe.p1.arraypractise;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array=new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in the array ");
		
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		
		findMinMax(array);
	}



public static void findMinMax(int []array) {
	
	int min=array[0];
	int max=array[0];
	
	for(int i=0;i<array.length;i++) {
		if(array[i]>max) {
			max=array[i];
		}
		else {
			min=array[i];
		}
	}
	System.out.println("The minimum element is"+min);
	System.out.println("The maximum element is"+max);
}

}