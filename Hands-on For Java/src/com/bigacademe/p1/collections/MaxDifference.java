package com.bigacademe.p1.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] a=new int[5];
		
		System.out.println("enter the elements in an array");
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=scanner.nextInt();
			
			
		}
		displayArray(a);
	}
		
		public static int displayArray(int[]a) {
		int diff = 0;

	    if (a.length == 0){ 
	        return -1;
	    }

	    int max = 0;
	    for (int i = 0; i < a.length-1; i++){

	        diff = Math.abs( a[i]-a[i+1]);
	        if(max < diff)
	            max = diff;
	        System.out.println(max);
	        
	        
	    	
	    }

	    return max;
	    


}
}

