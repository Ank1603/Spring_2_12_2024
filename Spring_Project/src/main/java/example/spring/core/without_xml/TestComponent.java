package example.spring.core.without_xml;

import org.springframework.stereotype.Component;

@Component // MArks this class as a managed component
public class TestComponent {
	
public void doTest() {
	 System.out.println("Test Component test succeded");
}
}
