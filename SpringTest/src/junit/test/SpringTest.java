package junit.test;

import org.junit.BeforeClass;
import org.junit.Test;

import cn.itcast.service.PersonServer;

public class SpringTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void instanceSpring() {
		ItcastClassPathXMLApplicationContext ctx = new ItcastClassPathXMLApplicationContext("beans.xml");
		PersonServer personService = (PersonServer)ctx.getBean("personService");
		personService.save();
	}

}
