package com.nsv.jsmbaba.loosecouping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");//bootstrap srping framework //bring up spring container
        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
