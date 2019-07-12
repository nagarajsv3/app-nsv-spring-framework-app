package com.nsv.jsmbaba.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SpringJdbcApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        ClerkDao clerkDao = applicationContext.getBean(ClerkDao.class);

        Clerk clerk = new Clerk("999-88-7778","Patrick",new Date(),null,true);
        clerkDao.createClerk(clerk);
        System.out.println("Create Clerk");
        System.out.println("Read Clerk:"+clerkDao.readClerk(clerk.getSsn()));
        System.out.println("Read All Clerks");
        clerkDao.readAllClerks().forEach(c -> System.out.println(c));
        System.out.println("Update Clerk");
        clerkDao.updateClerk(clerk.getSsn(),"PatSingh");
        System.out.println("Read Clerk After Update:"+clerkDao.readClerk(clerk.getSsn()));
        System.out.println("Delete Clerk");
        //clerkDao.deleteClerk(clerk.getSsn());
        System.out.println("Read All Clerks After Delete");
        clerkDao.readAllClerks().forEach(c -> System.out.println(c));




        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
