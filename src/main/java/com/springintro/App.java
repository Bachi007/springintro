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
//    	
//    		
    		car c=(car)bf.getBean("ca2");
    	System.out.println(c.getId()+" "+c.getName());
    
        	
    	
    	
    }
}
