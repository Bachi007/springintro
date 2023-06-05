package com.springintro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext bf=new ClassPathXmlApplicationContext("spring.xml");
    	
    		//bike b1=new bike();
    		vehicle b1=(vehicle) bf.getBean("vehicle");
    		b1.drive();
    }
}
