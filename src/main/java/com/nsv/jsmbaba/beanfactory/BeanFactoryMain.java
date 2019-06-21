package com.nsv.jsmbaba.beanfactory;

import com.nsv.jsmbaba.loosecouping.Shape;
import com.nsv.jsmbaba.loosecouping.ShapeCreator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryMain {
    public static void main(String[] args) {
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
        reader.loadBeanDefinitions("application-context.xml");
        ShapeCreator shapeCreator = beanFactory.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();

    }
}
