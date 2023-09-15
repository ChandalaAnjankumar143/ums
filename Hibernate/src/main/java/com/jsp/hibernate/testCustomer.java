package com.jsp.hibernate;

import java.util.ArrayList;
import java.util.List;

import com.jsp.Entity.BankAccount;
import com.jsp.Entity.Customer;
import com.jsp.repository.CustomerRepo;
import com.jsp.util.SessionfactoryUtil;

public class testCustomer {
	public static void main(String[] args) {
		List<BankAccount> list = new ArrayList<BankAccount>();
		list.add(new BankAccount(1, "anjan", "472"));
		list.add(new BankAccount(2, "anjan", "4732"));
		list.add(new BankAccount(3, "anjan", "4772"));	
		list.add(new BankAccount(4, "anjan", "47322"));
		Customer c = new Customer();
		c.setName("Anjan");
		c.setAddress("Banglore");
		c.setAccount(list);
        CustomerRepo repo = new CustomerRepo();
        repo.saveCustomer(c);
      
	}
}
