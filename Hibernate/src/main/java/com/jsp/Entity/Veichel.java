

package com.jsp.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="veichel_info")
public class Veichel implements Serializable {
	@Id
	@Column(name = "alt_key")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int altKey;
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "modal_no")
	private String modalNumber;
	
	@Column(name = "engine_no")
	private String engineNumber;
	
	@Column(name = "price")
	private String price;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="foreign_key")
	private RegisterationDetails details;
	
	
	public int getAltKey() {
		return altKey;
	}
	public void setAltKey(int altKey) {
		this.altKey = altKey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModalNumber() {
		return modalNumber;
	}
	public void setModalNumber(String modalNumber) {
		this.modalNumber = modalNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public RegisterationDetails getDetails() {
		return details;
	}
	public void setDetails(RegisterationDetails details) {
		this.details = details;
	}
}
