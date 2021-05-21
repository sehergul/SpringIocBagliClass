package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MySqlCustomerDal implements ICustomerDal{
	@Value("${database.connectionString}")
	String connectionString;

	@Override
	public void add() {
		System.out.println("Connection string: " + this.connectionString);
		System.out.println("MySql veri tabanýna eklendi!");

	}
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
