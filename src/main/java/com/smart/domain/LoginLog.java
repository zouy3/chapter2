package com.smart.domain;

import java.io.PipedReader;
import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private int loginLogId;
    private int userID;
    private String ip;
    private Date loginDate;

    public Date getLoginDate() {
        return loginDate;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public int getUserID() {
        return userID;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
