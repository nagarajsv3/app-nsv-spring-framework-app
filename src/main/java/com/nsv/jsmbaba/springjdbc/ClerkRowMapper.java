package com.nsv.jsmbaba.springjdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClerkRowMapper implements RowMapper<Clerk> {
    public Clerk mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Clerk(resultSet.getString("ssn"),resultSet.getString("name"),resultSet.getDate("joinedDate"),
                resultSet.getDate("terminationDate"),resultSet.getInt("active")==1?true:false);
    }
}
