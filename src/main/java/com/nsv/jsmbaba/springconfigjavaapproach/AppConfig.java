package com.nsv.jsmbaba.springconfigjavaapproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScans(value={
        @ComponentScan(basePackages = {
                "com.nsv.jsmbaba.springconfigjavaapproach"
        })
})
@PropertySources(value={@PropertySource(value="classpath:application.properties"),
                        @PropertySource(value="classpath:connection.properties")})
public class AppConfig {

    @Autowired
    private Environment env;

    @Bean(name="circle")
    @Scope(value = "singleton")
    //@Scope("singleton")
    //@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Circle getCircle(){return new Circle();}

    @Bean
    public Rectangle getRectangle(){
        return new Rectangle();
    }

    @Bean
    public Triangle getTriangle(){
        return new Triangle();
    }

    @Bean
    public ShapeCreator getShapeCreator(){
        System.out.println("reading from application.properties. title="+env.getProperty("title"));
        System.out.println("reading from connection.properties. connection.url="+env.getProperty("connection.url"));
        return new ShapeCreator(getCircle());
    }
}
