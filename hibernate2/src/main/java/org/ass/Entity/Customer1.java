package org.ass.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer1_info")
public class Customer1 implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;

	private String address;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "foreigncol")
	List<BankAccount1> account;
	
	public Customer1() {
		super();

	}

	public Customer1(int id, String name, String address, List<BankAccount1> account) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.account = account;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<BankAccount1> getAccount() {
		return account;
	}

	public void setAccount(List<BankAccount1> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer1 [id=" + id + ", name=" + name + ", address=" + address + ", account=" + account + "]";
	}
}
