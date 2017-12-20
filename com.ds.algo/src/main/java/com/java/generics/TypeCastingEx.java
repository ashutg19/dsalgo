package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingEx {

	public static void main(String[] args) {
		TypeCastingEx typeCastingEx = new TypeCastingEx();
		A a = (A) typeCastingEx;  //TYpe casting will work as A is subclass of TypeCastingEx
		//Compilation will work, but through run time-class cast exception
//		B a = (B) typeCastingEx; //TYpe casting will not work as B is not subclass of TypeCastingEx
		
		
		TypeCastingEx A2 = new A();
		A a2a=(A) A2;
		//Compilation and runtime both will will work
	
	}
	
	
	public void callA(){}
	public void callB(){}
}

class A extends TypeCastingEx {
	public void callA(){}
	public void callC(){}
	
}

class B {
	public static void main(String[] args) {
		
		ArrayList names = new ArrayList();
		
		int i=9;
		names.add("abcd"); //adding String
		names.add(1);   //adding Integer
		names.add(new A()); 
		names.add(i); 
		String name = (String) names.get(0); //OK
		name = (String) names.get(1);
		
		
		
		
		
		List<? extends Number> numbers=new ArrayList<Number>();
		
		List<Integer> integers=new ArrayList<Integer>();
		
		
	}
}
