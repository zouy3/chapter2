package com.smart.dao;

import com.smart.domain.LoginLog;
import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginLogDao {
    private JdbcTemplate jdbcTemplate;

    private final static String INSERT_LOGIN_LOG_SQL = " INSERT INTO " +
            " t_login_log(user_id, ip, datetime) "+
            " VALUES(?, ?, ?) ";

    public void insertLoginLog(LoginLog loginLog) {
        jdbcTemplate.update(INSERT_LOGIN_LOG_SQL,
                new Object[] {loginLog.getUserID(), loginLog.getIp(),
                        loginLog.getLoginDate()});
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
