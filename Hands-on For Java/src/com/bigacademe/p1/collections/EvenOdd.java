package com.bigacademe.p1.collections;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List l1=new ArrayList<>();
l1.add(0,12);
l1.add(1,1);
l1.add(2,32);
l1.add(3,3);

List l2=new ArrayList<>();
l2.add(0,0);
l2.add(1,12);
l2.add(2,2);
l2.add(3,23);

System.out.println(l1.size());
System.out.println(l2.size());

List l3=new ArrayList<>();
for(int i=0;i<l1.size();i++) {
if(i%2==0) {
	System.out.println("The index is even=" +i);
	l1.indexOf(i);
	l1.get(i);
	System.out.println("The element in the index=" +i);
	l3.add(i,i);
	
}
else if(!(i%2==0)) {	
		System.out.println("The index is odd=" +i);
		l2.indexOf(i);
		l2.get(i);
		System.out.println("The element in the index=" +i);
		l3.add(i,i);
	}

}
System.out.println("The elements in the list l3 are = "+l3);
}
}
