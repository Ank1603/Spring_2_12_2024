package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExample {

	public static void main(String[] args) {
		// Retrieving the bean from spring-config.xml against its Id:myBean
		ApplicationContext context;
		String filepath  ="./src/main/resources/spring-config.xml";
		context =new FileSystemXmlApplicationContext(filepath);
		Object loadedObject =context.getBean("myBean");
	   //GreetingService gs =( GreetingService)loadedObject;  //  method 1: typecasting with interface
		WelcomeService gs =(WelcomeService)loadedObject;  // method2:  interface with object class  both methods give same output bt 1 method will be preferred most  bcoz it is easy to acieve loose coupling
	   String reply =gs.sayGreeting();
	   System.out.println(reply);
	   
	   System.out.println("==========================================");
	   GreetingService gs2 =new WelcomeService();
	   System.out.println(gs2.sayGreeting());
	   
	   /*
	    * In this example both the objects referred by 'gs' and 'gs2' are 
	    * the components but 'gs' is obtained through Spring's environment 
	    * where 'gs2' is not
	    * Therefore 'gs' becomes a Managed Component and 'gs2' is an Unmanaged Component.
	    */
	}

}
