package com.nsv.jsmbaba.constantsdatastructures;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml-plus-annotations-application-context.xml");
        Employee naga = applicationContext.getBean(Employee.class);
        naga.setName("Nagaraja");
        System.out.println("Employee Naga Details: Memory Address="+naga+" \n\tComplete Details="+naga.toString());
        Employee baba = applicationContext.getBean(Employee.class);
        System.out.println("Employee Baba Details: Memory Address="+baba+" \n\tComplete Details="+baba.toString());
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
