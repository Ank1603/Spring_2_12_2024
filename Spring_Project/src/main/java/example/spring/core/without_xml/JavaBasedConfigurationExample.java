package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.GreetingService;

public class JavaBasedConfigurationExample {

public static void main(String[] args) {

AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//Registering configuration unit :SpringConfig with 'context'
context.register(SpringConfig.class);
//Refreshing the Context to apply the changes
context.refresh();

Object loadedObject = context.getBean("getGreetingImpl");
GreetingImpl gi = (GreetingImpl) loadedObject;
gi.doGreat();
}

}

