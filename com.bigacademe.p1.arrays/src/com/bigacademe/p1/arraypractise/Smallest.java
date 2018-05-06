package com.bigacademe.p1.arraypractise;
import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {50,40,30,20,10};
		
		
		
		
	
	findSmallest(a);
	}
	
	public static void findSmallest(int []a) {
		
   int temp;
		
            for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
			
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					}
				
				else if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
	}

}
            
            for(int i=0;i<a.length;i++) {
            	System.out.println("The  element in the array was"+a[i]);
            }
            System.out.println("The smallest  element in the array was"+a[a.length-1]);
            
	}
}
