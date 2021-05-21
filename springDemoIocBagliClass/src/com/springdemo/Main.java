package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context 
		= new AnnotationConfigApplicationContext(IocConfig.class);
	//Ýlgili config dosyasýna gidecek

	
	
	ICustomerService iCustomerService = context.getBean("service",ICustomerService.class);
		
	
	iCustomerService.add();
	
	
	}

}

