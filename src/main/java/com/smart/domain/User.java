package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private int userId;
    private String userName;
    private String password;
    private int credits;
    private String lastIp;
    private Date lastVisit;

    public Date getLastVisit() {
        return lastVisit;
    }

    public int getCredits() {
        return credits;
    }

    public int getUserId() {
        return userId;
    }

    public String getLastIp() {
        return lastIp;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
