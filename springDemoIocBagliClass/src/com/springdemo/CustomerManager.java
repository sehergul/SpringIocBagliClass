package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal iCustomerDal;
	
//	Constructor injection
	public CustomerManager(ICustomerDal iCustomerDal) {
		this.iCustomerDal = iCustomerDal;
	}
	
	@Override
	public void add() {
		this.iCustomerDal.add();
	}

}
