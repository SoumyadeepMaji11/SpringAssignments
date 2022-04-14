package com.training.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private String name;
	private int age;
	private String gender;
	
	@Autowired
	private Animal pet;

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Animal getPet() {
		return pet;
	}

	public void setPet(Animal pet) {
		this.pet = pet;
	}

	public String getAnimalDetails() {
		return this.pet.getDetails();
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", pet=" + pet + "]";
	}
	
	
}
