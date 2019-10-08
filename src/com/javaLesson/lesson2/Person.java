package com.javaLesson.lesson2;
import com.javaLesson.lesson3.Name;;

public class Person {
	
	private Name personName;
	private static int personCounter;
	
	public Person(Name personName){
		this.personName = personName;
	}
	
	public Person() {
		personCounter++;
		//empty intentionally
	}
	
	public String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

	public String hello(String name) {
		return "Hello " +name;
	}

	public static int numberOfPersons() {
		// TODO Auto-generated method stub
		return personCounter;
	}

}
