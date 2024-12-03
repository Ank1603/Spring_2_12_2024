package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLoadingExample {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("spring-config3.xml");
	context.getBean("bean3");   // if u comment this line it will not give u 3 times output
	}

}
