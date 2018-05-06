package com.bigacademe.p1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1=new ArrayList<>();
		//Set l1= new HashSet<>();
		//SortedSet l1=new TreeSet<>();
		l1.add(10);
		l1.add(22);
		l1.add(10);
		l1.add(3,4);
		
		System.out.println("size is"+l1.size());
		System.out.println("The list consists of"+l1);
		System.out.println("using iterator");
		Iterator ite = l1.iterator();
		while(ite.hasNext()) {
		Object obj=ite.next();
		System.out.println(obj);
		}
		
		System.out.println("using arrays");
		Object obj[]=l1.toArray();
		for(int i=0;i<obj.length;i++) {
		System.out.println(obj[i]);
		
	}

}
} 
