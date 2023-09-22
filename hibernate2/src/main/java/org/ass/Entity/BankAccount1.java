package org.ass.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_Account1")
public class BankAccount1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name = "account_no", unique = true)
	private String accountno;
	private Customer1 customer1;
	public BankAccount1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount1(int id, String name, String accountno, Customer1 customer1) {
		super();
		this.id = id;
		this.name = name;
		this.accountno = accountno;
		this.customer1 = customer1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public Customer1 getCustomer1() {
		return customer1;
	}
	public void setCustomer1(Customer1 customer1) {
		this.customer1 = customer1;
	}
	@Override
	public String toString() {
		return "BankAccount1 [id=" + id + ", name=" + name + ", accountno=" + accountno + ", customer1=" + customer1
				+ "]";
	}
}
