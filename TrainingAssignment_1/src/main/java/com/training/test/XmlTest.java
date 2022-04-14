package com.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.Person;

public class XmlTest {
@SuppressWarnings("resource")
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		
		Person p = (Person) context.getBean("person");
		System.out.println(p.getAnimalDetails());
		System.out.println(p);
		
	}
}
