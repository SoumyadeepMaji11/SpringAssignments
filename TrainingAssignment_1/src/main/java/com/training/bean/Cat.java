package com.training.bean;

public class Cat extends Animal {
	
	public int age;

	public Cat(String name, String species,int age) {
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
		return "Cat [age=" + age + ", getAge()=" + getAge() + ", getDetails()=" + getDetails() + "]";
	}
	
	
}
