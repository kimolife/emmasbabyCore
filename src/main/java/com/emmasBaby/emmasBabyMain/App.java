package com.emmasBaby.emmasBabyMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emmasBaby.domain.HumanResourceDept;
import com.emmasBaby.domain.Organization;
import com.emmasBaby.serviceImpl.CloudServiceImpl;

public class App {

	public static void main(String[] args) {
		// create Application Context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");


		// invoke method
		org.setBusinessService(new CloudServiceImpl());
		System.out.println(org.corporateSlogan());
		
		HumanResourceDept hrdept = (HumanResourceDept)ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(5050));
		//System.out.println(org.corporateService());
		//System.out.println(org.toString());

		// close the application context (Container). Good practice to close
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
