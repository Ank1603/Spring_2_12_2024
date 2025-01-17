package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExample {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("spring-config3.xml");
		Object obj = context.getBean("bean1");  // Requesting 1st time
		Object obj2 =	context.getBean("bean1"); // Requesting 2nd time
System.out.println("Same object?" + (obj==obj2));
	}

}
