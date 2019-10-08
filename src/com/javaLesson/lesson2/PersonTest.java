package com.javaLesson.lesson2;
import com.javaLesson.lesson10.LoggingLevel; 
import org.junit.Assert;
import org.junit.Test;

import com.javaLesson.lesson10.LoggingLevel;


public class PersonTest {
	
	static final String[] MY_STATE_VALUES = {"Pending","processing","processed"};
	
	@Test
	public void shouldRetunHelloWorld() {
		Person sarwar = new Person();
		Assert.assertEquals("Hello World", sarwar.helloWorld());
	}
	@Test
	public void shouldReturnSarwar() {
		Person person = new Person();
		Assert.assertEquals("Hello Sarwar",person.hello("Sarwar"));
		
	}
	@Test
	public void shouldRetunNumerOfPersons() {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Assert.assertEquals(5, Person.numberOfPersons());
	}
	@Test
	public void demostrateArrats() {
		Person[] persons = new Person[4];
		persons[1] = new Person();
		persons[2] = new Person();
		persons[3] = new Person();
		persons[4] = new Person();
		
		
		for(int i=0; i<4 ;i++) {
			persons[i] = new Person();
		}
		
		for(LoggingLevel stage : LoggingLevel.values()) {
			if(stage == LoggingLevel.PENDING) {
				
			}
			if(stage == LoggingLevel.PROCESSING) {
				
			}
			if(stage == LoggingLevel.PROCESSED) {
				
			}
		}
		
		//final Person[] persons2 = {persons[0], null, myPerson, myPerson2};
		
		//LoggingLevel state = LoggingLevel.PENDING; 
		
	}
}
