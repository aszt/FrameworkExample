package com.fin.pojo;

import java.util.Date;

public class Sequence {
    private Integer sequenceid;

    private Date actiontime;

    public Integer getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(Integer sequenceid) {
        this.sequenceid = sequenceid;
    }

    public Date getActiontime() {
        return actiontime;
    }

    public void setActiontime(Date actiontime) {
        this.actiontime = actiontime;
    }
}