package com.tn.ham.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.tn.ham.example")
@Configuration
public class My_Test {

	public static void main(String[] args) {
	       ApplicationContext context = new AnnotationConfigApplicationContext(My_Test.class);
	       MySimpleBean x=context.getBean(MySimpleBean.class);
	       x.sayHello();
	       
	       ((ConfigurableApplicationContext)context).close();
		
	}

}

