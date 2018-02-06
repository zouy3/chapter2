package com.smart.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private JdbcTemplate jdbcTemplate;

  //  private final static String

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getMatchCount(String userNmae, String password) {
        String sqlStr = "Select count(*) From t_user "
                + "where user_name =? and password=?";
        return jdbcTemplate.<Integer>queryForObject(sqlStr, new Object[]{userNmae, password}, Integer.class);
    }

}
