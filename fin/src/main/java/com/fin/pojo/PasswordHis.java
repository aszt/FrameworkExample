package com.fin.pojo;

import java.util.Date;

public class PasswordHis {
    private Integer passhisid;

    private String password;

    private Date createtime;

    private Integer acctseqid;

    public Integer getPasshisid() {
        return passhisid;
    }

    public void setPasshisid(Integer passhisid) {
        this.passhisid = passhisid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getAcctseqid() {
        return acctseqid;
    }

    public void setAcctseqid(Integer acctseqid) {
        this.acctseqid = acctseqid;
    }
}