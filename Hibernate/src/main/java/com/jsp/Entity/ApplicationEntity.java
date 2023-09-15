package com.jsp.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "application_info")
public class ApplicationEntity implements Serializable
{
	@Id
	@Column(name = "alt_key")
	@GenericGenerator(name = "auto_inc", strategy = "increment")
	@GeneratedValue(generator="auto_inc")
	private long altKey;

	@Column(name = "app_name")
	private String applicationName;

	@Column(name = "url")
	private String url;

	@Column(name = "app_type")
	private String applicationType;

	@Column(name = "user_name")
	private String username;

	@Column(name = "password")
	private String password;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

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

	@Override
	public String toString() {
		return "ApplicationEntity [altKey=" + altKey + ", applicationName=" + applicationName + ", url=" + url
				+ ", applicationType=" + applicationType + ", username=" + username + ", password=" + password + "]";
	}

}
