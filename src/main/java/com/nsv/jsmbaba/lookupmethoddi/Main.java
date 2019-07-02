package com.nsv.jsmbaba.lookupmethoddi;

import com.nsv.jsmbaba.xmlplusannotations.Shape;
import com.nsv.jsmbaba.xmlplusannotations.ShapeCreator;
import com.nsv.jsmbaba.xmlplusannotations.ShapeCreator1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lookupmethoddi.xml");
        Consultancy consultancy = applicationContext.getBean(Consultancy.class);
        Resource newResource = consultancy.getMeANewResource();
        newResource.joining();

        Resource newResource1 = consultancy.getMeANewResource();
        newResource1.joining();


        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
