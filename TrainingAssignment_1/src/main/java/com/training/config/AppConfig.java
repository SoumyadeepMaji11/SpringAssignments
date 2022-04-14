package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.bean.Cat;
import com.training.bean.Dog;
import com.training.bean.Person;

@Configuration
public class AppConfig {

	@Bean("cat")
	public Cat getCat() {
		Cat c = new Cat("Lulu","mammal",4);
		return c;
	}
	
	@Bean("person")
	public Person getPerson() {
		Person p = new Person("Sdm",23,"Male");
		return p;
	}
	
	@Bean("Dog")
	public Dog getDog() {
		Dog d = new Dog("Tommy","Mammal",3);
		return d;
	}
}
