package com.training.bean;

public class Dog extends Animal{
	
	private int age;

	public Dog(String name, String species,int age) {
		super(name, species);
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDetails() {
		return this.getName()+" "+this.getSpecies();
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + ", getAge()=" + getAge() + ", getDetails()=" + getDetails() + "]";
	}

	
}
