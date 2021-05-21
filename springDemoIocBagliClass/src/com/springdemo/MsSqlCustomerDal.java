package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//component vermektense IocConfig s�n�f�nda @Bean annotation'u ile return verebiliriz
//e�er @Bean verilmediyse component verilmelidir
//component ve bean ayn� anda varsa, bean a��r basar
//yani component ba�ka s�n�fta olsa dahi bean'de verilen return ge�erli olur

//Component("database") //sadece bir yere verilmelidir
public class MsSqlCustomerDal implements ICustomerDal{
	
	@Value("${database.connectionString}")
	String connectionString;

	@Override
	public void add() {
		System.out.println("Connection string: " + this.connectionString);
		System.out.println("MsSql veri taban�na eklendi!");

	}
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
