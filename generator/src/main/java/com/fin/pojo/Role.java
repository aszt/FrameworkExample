package com.fin.pojo;

import java.util.Date;

public class Role {
    private Integer roleid;

    private String rolename;

    private String roledef;

    private String description;

    private String roleecho;

    private Integer createdby;

    private Date createdat;

    private Integer updatedby;

    private Date updatedat;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledef() {
        return roledef;
    }

    public void setRoledef(String roledef) {
        this.roledef = roledef == null ? null : roledef.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRoleecho() {
        return roleecho;
    }

    public void setRoleecho(String roleecho) {
        this.roleecho = roleecho == null ? null : roleecho.trim();
    }

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Integer getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }
}