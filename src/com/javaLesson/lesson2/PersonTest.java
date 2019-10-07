package com.javaLesson.lesson2;
import org.junit.Assert;
import org.junit.Test;


public class PersonTest {
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
	
}
