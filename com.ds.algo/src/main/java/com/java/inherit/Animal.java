package com.java.inherit;

public class Animal {

	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
	
	public void eat(String a) {
		System.out.println("Generic Animal Eating Generically");
	}
	
	
	public void eat(Integer a) {
		System.out.println("Generic Animal Eating Generically");
	}

	
	public void eatExc() throws Exception {
		// throws an Exception
		}

	
	public static void main(Integer[] args) {
		Animal b = new Horse(); // Animal ref, but a Horse
		// object , so far so good
		b.eat();

	}
	
	public static void main(Long[] args) {
		Animal b = new Horse(); // Animal ref, but a Horse
		// object , so far so good
		b.eat();

	}

}

class Horse extends Animal {
	public void eat() { // whoa! - it's private!
		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}
	public void eatExc() {
		// throws an Exception
		}
	
}