package com.nsv.jsmbaba.springbeanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor Interface : postProcessBeforeInitialization method : BeforeInstantiation of = "+beanName);
        return bean;
    }

    public  Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor Interface : postProcessAfterInitialization method : AfterInstantiation = "+beanName);
        return bean;
    }
}
