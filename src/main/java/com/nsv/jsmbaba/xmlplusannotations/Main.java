package com.nsv.jsmbaba.xmlplusannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml-plus-annotations-application-context.xml");
        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();

        ShapeCreator1 shapeCreator1 = applicationContext.getBean(ShapeCreator1.class);
        Shape shape1 = shapeCreator1.getShape();
        shape1.drawShape();
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
