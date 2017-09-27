package com.capgemini.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.Employee;

public class SpringApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = context.getBean("employee",Employee.class);
		emp.setEmployeeNumber(102);
		emp.setName("Snehal");
		System.out.println("id :"+emp.getEmployeeNumber());
		System.out.println("Name :"+emp.getName());
		System.out.println("address :"+emp.getAddress().getCity());
	}

}
