package com.nsv.jsmbaba.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySources(value={@PropertySource(value = "classpath:connection.properties")})
public class SpringJdbcConfig {
    @Autowired
    private Environment environment;

    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }

    public DataSource dataSource(){
        DriverManagerDataSource dataSource =new DriverManagerDataSource(environment.getProperty("connection.url"),environment.getProperty("connection.username"),environment.getProperty("connection.password"));
        return dataSource;
    }
}
