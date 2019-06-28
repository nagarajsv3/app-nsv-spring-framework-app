package com.nsv.jsmbaba.beanwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanwiring.xml");
        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Circle circle = shapeCreator.getCircle();
        circle.drawCircle();
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
