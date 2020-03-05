package com.dmvtc.AbdelPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle c = context.getBean("vehicle",Vehicle.class);
        c.drive();
        Vehicle b = context.getBean("vehicles",Vehicle.class);
        b.drive();
        
        Tires t = context.getBean("tires",Tires.class);
        System.out.println(t);
    }
}
