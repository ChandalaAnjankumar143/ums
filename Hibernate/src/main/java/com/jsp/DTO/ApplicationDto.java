package com.jsp.DTO;

import java.io.Serializable;

public class ApplicationDto implements Serializable {

//	private String applicationName;
//	private String url;
//	private String applicationType;
	private String username;
	private String password;
	private long altKey;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getAltKey() {
		return altKey;
	}
	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}
	@Override
	public String toString() {
		return "ApplicationDto [username=" + username + ", password=" + password + ", altKey=" + altKey + "]";
	}	
}
