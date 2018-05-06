package com.myc.wrapper;

public class Converter {

	

	public void convertWrapper(int a,float f) {
		
		System.out.println("Primitive to object conversion");
		 
		 int a1=10;
		 Integer a2=new Integer(a1);
		 
		 float f1=20.5f;
		 Float f2=new Float(f1);
		 	
	}
	
	public void convertPrimitive(int c,float d) {
		
		System.out.println(" object to primitive conversion");
		
		Integer io=new Integer(10);
		int c1=io.intValue();
		
		Float fo=new Float(30.5f);
		float d1=fo.floatValue();
		 
		
		
	
	}
}


