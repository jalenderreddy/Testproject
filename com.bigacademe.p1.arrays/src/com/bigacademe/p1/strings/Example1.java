package com.bigacademe.p1.strings;

import java.util.stream.IntStream;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
		String s = "hello its ok bye";
		String s1 = "hello";
		String s3 = new String("HELLO");
		
		char c = s.charAt(4);
		System.out.println(c);
		int len = s1.length();
		System.out.println(len);
		
		boolean result = s.equals(s3);
		boolean result1 = s.equalsIgnoreCase(s3);
		
		System.out.println(result+" "+result1);
		
		String s4 = s.concat(s3);//s+s1
		
		System.out.println(s4);
		
		boolean result3= s.startsWith("hello");
		boolean result4 = s.endsWith("ye");
		
		System.out.println(result3+" "+result4);
		
		StringBuffer sb= new StringBuffer("avinash");
		sb.append("avi");
		
		System.out.println(sb.length()+" "+sb.capacity());
		
		String s5 = "hi,hello,bye,ok";
		String [] sf= s5.split(",");
		
		for(i=0;i<sf.length;i++) {
			System.out.println(sf[i]);
		}
		
		
	}

}
