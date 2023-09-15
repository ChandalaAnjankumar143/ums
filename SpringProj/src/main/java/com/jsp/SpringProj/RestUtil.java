package com.jsp.SpringProj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class RestUtil {
	@Value("https://localhost:8081/SpringProj")
	private String url;

	@Value("username")
	private String requestBody;

	@Value("success")
	private String responseBody;

	public String getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	@Override
	public String toString() {
		return "RestUtil [url=" + url + ", requestBody=" + requestBody + ", responseBody=" + responseBody + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public RestUtil() {
		System.out.println(this.getClass().getSimpleName() + "Object is created");
	}

	public void m1() {
		System.out.println("Hi anjan ");
	}
}
