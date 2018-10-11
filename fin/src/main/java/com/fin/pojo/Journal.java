package com.fin.pojo;

import java.util.Date;

public class Journal {
    private Integer seqid;

    private String journalid;

    private Integer acctseqid;

    private String actiondesc;

    private Date dotime;

    public Integer getSeqid() {
        return seqid;
    }

    public void setSeqid(Integer seqid) {
        this.seqid = seqid;
    }

    public String getJournalid() {
        return journalid;
    }

    public void setJournalid(String journalid) {
        this.journalid = journalid == null ? null : journalid.trim();
    }

    public Integer getAcctseqid() {
        return acctseqid;
    }

    public void setAcctseqid(Integer acctseqid) {
        this.acctseqid = acctseqid;
    }

    public String getActiondesc() {
        return actiondesc;
    }

    public void setActiondesc(String actiondesc) {
        this.actiondesc = actiondesc == null ? null : actiondesc.trim();
    }

    public Date getDotime() {
        return dotime;
    }

    public void setDotime(Date dotime) {
        this.dotime = dotime;
    }
}