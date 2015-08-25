package com.tn.ham.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MySimpleBean implements InitializingBean, DisposableBean{

	public void sayHello(){
		System.out.println("Je vous passe le salut !");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("methode Destroy -> faire qlq nettoyage ...  ");		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("methode afterPropertiesSet -> faire le necessaire pour l'initialisation ...  ");	
	}
}
