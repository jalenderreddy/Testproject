package com.bigacademe.p1.collections;

import java.util.ArrayList;
import java.util.List;

public class AverageList {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		List l1=new ArrayList<>();
		l1.add(0, 1);
		l1.add(1, 2);
		l1.add(2, 3);
		l1.add(3, 4);
		l1.add(4, 5);
		l1.add(5, 6);
		l1.add(6, 7);
		l1.add(7, 8);
		l1.add(8, 9);
		l1.add(9, 10);
		System.out.println("The size of list l1="+l1.size());
		int average;
		for(int i=2;i<l1.size();i++) {
			if(l1.indexOf(i)%1==0 && l1.indexOf(i)%2==0 ) {
			
				System.out.println(i);
		}
		
		
	
	}

}
}


