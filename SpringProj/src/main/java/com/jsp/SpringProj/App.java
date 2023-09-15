package com.jsp.SpringProj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Configuration.AppConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
           AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext();
			an.register(AppConfiguration.class);
             an.refresh();
             
            // RestUtil bean = an.getBean(RestUtil.class);
             CommonUtil b1 = an.getBean(CommonUtil.class);
          //    bean.m1();
         //     b1.m2();	
         //   System.out.println(bean);
          //  System.out.println(b1);
         //   b1.m2();
             an.getBean(CommonUtil.class);
             an.getBean(CommonUtil.class);
             an.getBean(CommonUtil.class);
             an.getBean(CommonUtil.class);
             an.getBean(CommonUtil.class);
             an.getBean(CommonUtil.class);
          
          
    }
}
