package com.nsv.jsmbaba.springbeanprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySources(value={@PropertySource(value = "classpath:connection.properties")})
public class SpringBeanProfileConfig {

    @Autowired
    private Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }

    @Bean
    @Profile(value={"dev","qa","perf"})
    public DataSource dataSource(){
        DriverManagerDataSource dataSource =new DriverManagerDataSource(environment.getProperty("connection.url"),environment.getProperty("connection.username"),environment.getProperty("connection.password"));
        return dataSource;
    }

    @Bean
    @Profile(value={"prod"})
    public DataSource dataSourceProd(){
        DriverManagerDataSource dataSource =new DriverManagerDataSource(environment.getProperty("connection.url"),environment.getProperty("connection.username"),environment.getProperty("connection.password"));
        return dataSource;
    }

}
