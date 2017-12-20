package com.java.generics;

//public class GenericsAtClassLevel {  this will give compilation error
public class GenericsAtClassLevel<T, S> {

	public String normalString;

	public T genericVariable;// T cannot be resolved to a type-Add Type 'T'
								// parameter at class level

	public void compare(S a) {//Method variable generic type can be add at method or class level both

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//Implementation class must pass actual class type to parent class---See example of comparable interface with Integer/String classess
class BaseClass extends GenericsAtClassLevel<BaseClass, B>{//again here 'B' can not be resolved to type
	
	public void compare(BaseClass a) {

	}
	
	
	
	
}
