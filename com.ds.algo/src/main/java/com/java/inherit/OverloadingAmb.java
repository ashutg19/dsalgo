package com.java.inherit;

public class OverloadingAmb {

	static void fun(int... a) { 
		System.out.println("loduuuuuu");// method body
	}
	
	static void fun(Integer  a) { 
		System.out.println("loduuuuuu");// method body
	}

	static void fun(int n, int... a) { // method body }
		System.out.println("ranaaaaaaaa");// method body
	}
	
	static void funString(Integer string) { 
		System.out.println("charrr");// method body
	}

	static void funString(String string) { 
		System.out.println("string");// method body
	}
	
	
	static void funString(Object string) { 
		System.out.println("object");// method body
	}

	
	static void fun(int  a) { 
		System.out.println("loduuuuuu");// method body
	}
	
	public static void main(String[] args) {
		funString(null);
		fun();
		fun(null);
		System.out.println();
	}

}
