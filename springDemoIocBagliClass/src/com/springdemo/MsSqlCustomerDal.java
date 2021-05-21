package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//component vermektense IocConfig sýnýfýnda @Bean annotation'u ile return verebiliriz
//eðer @Bean verilmediyse component verilmelidir
//component ve bean ayný anda varsa, bean aðýr basar
//yani component baþka sýnýfta olsa dahi bean'de verilen return geçerli olur

//Component("database") //sadece bir yere verilmelidir
public class MsSqlCustomerDal implements ICustomerDal{
	
	@Value("${database.connectionString}")
	String connectionString;

	@Override
	public void add() {
		System.out.println("Connection string: " + this.connectionString);
		System.out.println("MsSql veri tabanýna eklendi!");

	}
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
