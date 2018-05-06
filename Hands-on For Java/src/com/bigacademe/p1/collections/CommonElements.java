package com.bigacademe.p1.collections;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1=new ArrayList<>();
		//Set l1= new HashSet<>();
		//SortedSet l1=new TreeSet<>();
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		l1.add(3,4);
		System.out.println("elements of l1"+l1);
		
		List l2=new ArrayList<>();
		//Set l1= new HashSet<>();
		//SortedSet l1=new TreeSet<>();
		l2.add(0,3);
		l2.add(1,4);
		l2.add(2,5);
		l2.add(3,6);
		System.out.println("elements of l2"+l2);
		
		List<Integer> l3 = new ArrayList<Integer>(l1);
		l3.retainAll(l2);
	
		System.out.println(" common elements of l1 and l2 is"+l3);
		
		
		
		
	}

}
