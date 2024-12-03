package example.spring.core.without_xml;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration // Marks this class as a Configuration unit
@ComponentScan(basePackages={"another","third"}) // Used to perform package scan
public class SpringConfig {
	@Bean // marks this method as a bean configuration specific method
	public GreetingImpl getGreetingImpl() {
		GreetingImpl gi = new GreetingImpl();
		return gi;

	}

	// configure a bean of type messageImpl with some
	// different ID: myMessage
	@Bean("myMessage")
	public MessageImpl getMessageImpl() {
		MessageImpl mi = new MessageImpl();
		return mi;

	}

	// configuring a bean of type: java.util.collection

	@Bean("allCourses")
	public Collection<String> getCourseList() {
		Collection<String> courseList = Arrays.asList("Core Java", "Spring", "React", "Angular", "AWS");
		return courseList;
	}
	@Bean("myTest")
	@Lazy // marks this bean as lazy so that it gets Loaded Lazily
	// this is equivalent to Lazy-init = true
	@Scope("prototype") // marks this bean with Scope as prototype
	// this is equivalent to Scope = "prototype"
	public TestImpl getTestImpl() {
		TestImpl ti = new TestImpl();
		return ti;

	}

}