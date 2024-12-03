package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskWiring {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("spring-config4.xml");
		Object profileObject =context.getBean("profile");
		System.out.println(profileObject);
	}

}
