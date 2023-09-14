package com.Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("singleton")
@Component
public class RestUtil {
	public RestUtil() 
	{
		System.out.println(this.getClass().getSimpleName() + " object is created");
	}
	public void rutil() {
		System.out.println("method from the RsetUtil");
	}
}
