package com.Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class CommonUtil {
	public CommonUtil() {
		System.out.println(this.getClass().getSimpleName() + " Object is created");
	}
	public void cutil() {
		System.out.println("method from the CommonUtil");
	}
}
