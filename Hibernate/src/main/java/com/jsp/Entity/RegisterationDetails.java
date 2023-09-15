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
@Table(name = "registeration_info")
public class RegisterationDetails implements Serializable {
	@Id
	@Column(name = "alt_key")
	@GenericGenerator(name = "auto_inc", strategy = "increment")
	@GeneratedValue(generator = "auto_inc")
	private long altKey;

	@Column(name = "reg_number")
	private String regnumber;

	@Column(name = "reg_date")
	private String regDate;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getRegnumber() {
		return regnumber;
	}

	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}
