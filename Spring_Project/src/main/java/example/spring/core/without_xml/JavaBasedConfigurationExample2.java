package example.spring.core.without_xml;

import java.util.Collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.GreetingService;

public class JavaBasedConfigurationExample2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Object loadedObject = context.getBean("myMessage");

		MessageImpl mi = (MessageImpl) loadedObject;

		mi.printMessage(" 🙏 Welcome", "GRS");

		System.out.println(

				"--------------------------------------------------------------------------------------------------------------------");

		loadedObject = context.getBean("allCourses");

		Collection<String> allAvilableCourses = (Collection<String>) loadedObject;

		allAvilableCourses.stream().forEach(course -> System.out.println(course.toUpperCase()));

		System.out.println(

				"--------------------------------------------------------------------------------------------------------------------");

		Object obj = context.getBean("myTest");

		Object obj2 = context.getBean("myTest");

		System.out.println("Same Object: " + (obj == obj2));

	}

}
