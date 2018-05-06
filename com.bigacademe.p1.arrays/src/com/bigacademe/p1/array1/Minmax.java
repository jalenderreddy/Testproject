package com.bigacademe.p1.array1;
import java.util.Scanner;
public class Minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a=new int[10];
		
		System.out.println("enter the elements in an array");
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=scanner.nextInt();
			
		}
		
		maxAndMin(a);
	}
	public static void maxAndMin(int[] a)
	{
		int max=a[0];
		int min=a[0];
		for (int i = 0; i <a.length; i++)
	    {
	      if (a[i] > max)
	        {
	          max = a[i];
	        }
	      else if (a[i] < min)
	        {
	          min = a[i];
	        }
	    }
	  System.out.println("min:"+min);
	  System.out.println("max:"+max);
	  
	  
	}

	
}

