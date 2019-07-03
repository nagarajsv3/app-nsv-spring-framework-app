package com.nsv.jsmbaba.springconfigjavaapproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();
        ((AnnotationConfigApplicationContext)applicationContext).close();
    }
}
