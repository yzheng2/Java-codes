package com.importnew;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HellowWorld obj = (HellowWorld) context.getBean("helloWorld");
		
		obj.printMessage();
	}

}
