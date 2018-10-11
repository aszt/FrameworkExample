package com.fin.pojo;

import java.util.Date;

public class Merchant {
    private Integer merid;

    private String merchantno;

    private String name;

    private String mobileno;

    private String companyname;

    private String nameabbr;

    private String meremail;

    private String description;

    private String imgurl;

    private Date createdate;

    private Integer parentid;

    private Integer levelin;

    private String isdeposit;

    private String orgstatus;

    private String orgtype;

    private String workflowkey;

    private Integer merapplyid;

    private Date createdat;

    private Integer createdby;

    private Date updatedat;

    private Integer updatedby;

    private String parentCompany;

    private String companyType;

    private String companyStatus;

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus;
    }

    public Integer getMerid() {
        return merid;
    }

    public void setMerid(Integer merid) {
        this.merid = merid;
    }

    public String getMerchantno() {
        return merchantno;
    }

    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno == null ? null : merchantno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno == null ? null : mobileno.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getNameabbr() {
        return nameabbr;
    }

    public void setNameabbr(String nameabbr) {
        this.nameabbr = nameabbr == null ? null : nameabbr.trim();
    }

    public String getMeremail() {
        return meremail;
    }

    public void setMeremail(String meremail) {
        this.meremail = meremail == null ? null : meremail.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getLevelin() {
        return levelin;
    }

    public void setLevelin(Integer levelin) {
        this.levelin = levelin;
    }

    public String getIsdeposit() {
        return isdeposit;
    }

    public void setIsdeposit(String isdeposit) {
        this.isdeposit = isdeposit == null ? null : isdeposit.trim();
    }

    public String getOrgstatus() {
        return orgstatus;
    }

    public void setOrgstatus(String orgstatus) {
        this.orgstatus = orgstatus == null ? null : orgstatus.trim();
    }

    public String getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype == null ? null : orgtype.trim();
    }

    public String getWorkflowkey() {
        return workflowkey;
    }

    public void setWorkflowkey(String workflowkey) {
        this.workflowkey = workflowkey == null ? null : workflowkey.trim();
    }

    public Integer getMerapplyid() {
        return merapplyid;
    }

    public void setMerapplyid(Integer merapplyid) {
        this.merapplyid = merapplyid;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public Integer getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }
}