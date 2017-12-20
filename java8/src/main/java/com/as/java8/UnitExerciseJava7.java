package com.as.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.as.dto.Person;

public class UnitExerciseJava7 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("ashish", "Male", 2), new Person("sandeep", "Male", 2),
				new Person("sonal", "Female", 5), new Person("gaurav", "Male", 6));

		printAll(persons);

		// Sort persons list based on first name

		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("==========================================");
		printAll(persons);

		// Print person name whose age is >4
		System.out.println("==========================================");
		printAllWithCondition(persons, new Condition() {

			@Override
			public boolean test(Person person) {
				return person.getAge() > 4;
			}
		});
		
		
		System.out.println("==========================================");
		printAllWithCondition(persons, new Condition() {

			@Override
			public boolean test(Person person) {
				return person.getAge() > 1;
			}
		});

	}

	public static void printAll(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(person.getName());
		}
	}

	public static void printAllWithCondition(List<Person> persons, Condition condition) {
		for (Person person : persons) {
			if (condition.test(person)) {
				System.out.println(person.getName());
			}
		}
	}

}

interface Condition {

	public boolean test(Person person);

}
