package com.nsv.jsmbaba.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ClerkDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createClerk(Clerk clerk){
        String sql = "insert into clerk(ssn,name,joinedDate,terminationDate,active) values(?,?,?,?,?)";
        return jdbcTemplate.update(sql,new Object[]{clerk.getSsn(),clerk.getName(),clerk.getJoinedDate(),clerk.getTerminationDate(),clerk.isActive() ? 1:0});
    }

    public Clerk readClerk(String ssn){
        String sql = "select * from clerk where ssn=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{ssn},new ClerkRowMapper());
    }

    public List<Clerk> readAllClerks(){
        String sql = "select * from clerk";
        return jdbcTemplate.query(sql,new ClerkRowMapper());
    }

    public void updateClerk(String ssn, String name){
        String sql = "update clerk set name = ? where ssn = ?";
        jdbcTemplate.update(sql,new Object[]{name,ssn});
    }

    public void deleteClerk(String ssn){
        String sql = "delete from clerk where ssn = ?";
        jdbcTemplate.update(sql,new Object[]{ssn});
    }

}
