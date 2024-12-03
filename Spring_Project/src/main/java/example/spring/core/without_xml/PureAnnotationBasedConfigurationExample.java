package example.spring.core.without_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import another.AnotherTestComponent;
import third.ThirdTestComponent;
import third.last.LastTestComponent;
import third.ThirdTestComponent;

public class PureAnnotationBasedConfigurationExample {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		              TestComponent testcomp =context.getBean(TestComponent.class);
//		              testcomp.doTest();
		         System.out.println("============================");
	     AnotherTestComponent anotherTestComp = context.getBean(AnotherTestComponent.class);
	     anotherTestComp.doTest();
	     
	     System.out.println("============================");
	     ThirdTestComponent thirdcomp =context.getBean(ThirdTestComponent.class);
	     thirdcomp.doTest();
	     
	     System.out.println("============================");
	     LastTestComponent lastComp =context.getBean(LastTestComponent.class);
	     lastComp.doTest();
	}
	

}
