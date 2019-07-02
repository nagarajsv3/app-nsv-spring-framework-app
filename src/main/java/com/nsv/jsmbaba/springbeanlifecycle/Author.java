package com.nsv.jsmbaba.springbeanlifecycle;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

@Getter
@Setter
public class Author implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean{
    private Book book;
    private String name;

    public void setBeanName(String s) {
        System.out.println("BeanNameAware Interface : setBeanName method : Bean Name ="+s);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware Interface : setBeanFactory method : Bean Factory ="+beanFactory);
        Book bean = beanFactory.getBean(Book.class);
        System.out.println("Using BeanFactoryAware Interface accessing Book Instance"+bean.toString());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean Interface : afterPropertiesSet method : Bean is initialized and all properties are set");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean Interface : destroy method : Bean is being destroyed.");
    }

    public void custominit(){
        System.out.println("Custom Init Method - Configured in Spring Bean Config");
    }

    public void customdestroy() throws Exception {
        System.out.println("Custom Destroy Method- Configured in Spring Bean Config");
    }
}
