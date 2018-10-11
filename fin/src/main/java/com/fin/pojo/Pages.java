package com.fin.pojo;

public class Pages {
    private Integer pageid;

    private String pagekey;

    private String pagetext;

    private String pageurl;

    private String isleaf;

    private Integer parentid;

    private String targetframe;

    private String description;

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public String getPagekey() {
        return pagekey;
    }

    public void setPagekey(String pagekey) {
        this.pagekey = pagekey == null ? null : pagekey.trim();
    }

    public String getPagetext() {
        return pagetext;
    }

    public void setPagetext(String pagetext) {
        this.pagetext = pagetext == null ? null : pagetext.trim();
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl == null ? null : pageurl.trim();
    }

    public String getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(String isleaf) {
        this.isleaf = isleaf == null ? null : isleaf.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getTargetframe() {
        return targetframe;
    }

    public void setTargetframe(String targetframe) {
        this.targetframe = targetframe == null ? null : targetframe.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}