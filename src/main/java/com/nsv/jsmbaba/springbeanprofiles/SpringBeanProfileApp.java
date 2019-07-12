package com.nsv.jsmbaba.springbeanprofiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringBeanProfileApp {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active","dev");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean-profiles.xml");
        JdbcTemplate bean = applicationContext.getBean(JdbcTemplate.class);
        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
