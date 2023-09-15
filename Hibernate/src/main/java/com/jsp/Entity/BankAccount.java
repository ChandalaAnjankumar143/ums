package com.jsp.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_info")
public class BankAccount implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String name;
	@Column(name="account_no",unique=true)
	private String accountno;

	public BankAccount() {

		// TODO Auto-generated constructor stub
	}

	public BankAccount(int id, String name, String accountno) {
		super();
		this.id = id;
		this.name = name;
		this.accountno = accountno;
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

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", name=" + name + ", accountno=" + accountno + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAccountno()=" + getAccountno() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
