package com.fin.pojo;

public class SysParams {
    private Integer paramid;

    private String keystr;

    private String value1;

    private String value2;

    private String typestr;

    public Integer getParamid() {
        return paramid;
    }

    public void setParamid(Integer paramid) {
        this.paramid = paramid;
    }

    public String getKeystr() {
        return keystr;
    }

    public void setKeystr(String keystr) {
        this.keystr = keystr == null ? null : keystr.trim();
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1 == null ? null : value1.trim();
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2 == null ? null : value2.trim();
    }

    public String getTypestr() {
        return typestr;
    }

    public void setTypestr(String typestr) {
        this.typestr = typestr == null ? null : typestr.trim();
    }
}