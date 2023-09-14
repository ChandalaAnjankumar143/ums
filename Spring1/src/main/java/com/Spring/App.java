package com.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Spring.config.AppConfiguration;

public class App {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.register(AppConfiguration.class);
	context.refresh();
	RestUtil bean = context.getBean(RestUtil.class);
	CommonUtil bean2 = context.getBean(CommonUtil.class);
	//bean.rutil();
 	bean2.cutil();
	context.getBean(RestUtil.class);
	context.getBean(RestUtil.class);
	context.getBean(RestUtil.class);
	context.getBean(RestUtil.class);

	context.getBean(CommonUtil.class);
	context.getBean(CommonUtil.class);
	context.getBean(CommonUtil.class);

}
}
