package com.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain2 {
    public static void main(String [] args){
        ApplicationContext acx = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld = (HelloWorld) acx.getBean("helloWorld");
        System.out.println(helloWorld);
    }

}
