package com.nsv.jsmbaba.springbeanlifecycle;

import com.nsv.jsmbaba.xmlplusannotations.Shape;
import com.nsv.jsmbaba.xmlplusannotations.ShapeCreator;
import com.nsv.jsmbaba.xmlplusannotations.ShapeCreator1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean-lifecycle.xml");
        Author author = applicationContext.getBean(Author.class);
        System.out.println("Author="+author);
        Book book = author.getBook();
        System.out.println("Book="+book);
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
