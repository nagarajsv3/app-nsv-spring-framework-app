package com.nsv.jsmbaba.readingpropertyfile;

import com.nsv.jsmbaba.constantsdatastructures.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml-plus-annotations-application-context.xml");
        Author naga = (Author)applicationContext.getBean("author");
        naga.setName("Nagaraja");
        System.out.println("Author="+naga);
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
