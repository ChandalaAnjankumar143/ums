package com.jsp.SpringProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class CommonUtil {

	@Autowired
	private RestUtil restUtil;

	public RestUtil getRestUtil() {
		return restUtil;
	}

	public void setRestUtil(RestUtil restUtil) {
		this.restUtil = restUtil;
	}

	public CommonUtil() {
		System.out.println(this.getClass().getSimpleName() + "object is created");
	}

	@Override
	public String toString() {
		return "CommonUtil [restUtil=" + restUtil + "]";
	}

	public void m2() {
		System.out.println("Method from commonUtil");
		restUtil.m1();
	}

}
