package com.fin.bean;

/**
 * 工作流部署对象
 */
public class Workflow {
    private String id;

    private String name;

    private String key;

    private int Version;

    private String diagramResourceName;

    private String deploymentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }

    public String getDiagramResourceName() {
        return diagramResourceName;
    }

    public void setDiagramResourceName(String diagramResourceName) {
        this.diagramResourceName = diagramResourceName;
    }

    public String getDeploymentID() {
        return deploymentId;
    }

    public void setDeploymentID(String deploymentId) {
        this.deploymentId = deploymentId;
    }
}
