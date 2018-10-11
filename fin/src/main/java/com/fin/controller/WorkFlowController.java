package com.fin.controller;

import com.fin.bean.Workflow;
import com.fin.service.IWorkFlowService;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.repository.ProcessDefinition;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping({"workFlow"})
@Controller
public class WorkFlowController {
    @Autowired
    private IWorkFlowService workFlowService;
    @Autowired
    private ProcessEngine processEngine;

    @RequestMapping(value = {"saveNewDeploye"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> saveNewDeploye(@RequestParam("file") MultipartFile file) {
        Map<String, Object> map = new HashMap();
        try {
            boolean flag = this.workFlowService.saveNewDeploye(file);
            if (flag) {
                map.put("code", "0");
                map.put("msg", "部署成功");
            } else {
                map.put("code", "1");
                map.put("msg", "部署失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping(value = {"findDeploymentListByPage"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> findDeploymentListByPage(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "limit", defaultValue = "10") Integer limit, Workflow workflow) {
        Map<String, Object> map = new HashMap();
        List<Workflow> workflows = new ArrayList();
        try {
            List<ProcessDefinition> processDefinitions = this.workFlowService.findDeploymentListByPage(page, limit, workflow);
            long count = this.processEngine.getRepositoryService().createProcessDefinitionQuery().count();
            if ((processDefinitions != null) && (processDefinitions.size() > 0)) {
                for (ProcessDefinition processDefinition : processDefinitions) {
                    Workflow bean = new Workflow();
                    bean.setId(processDefinition.getId());
                    bean.setName(processDefinition.getName());
                    bean.setKey(processDefinition.getKey());
                    bean.setDeploymentID(processDefinition.getDeploymentId());
                    bean.setVersion(processDefinition.getVersion());
                    bean.setDiagramResourceName(processDefinition.getDiagramResourceName());
                    workflows.add(bean);
                }
                map.put("total", count);
                map.put("workflows", workflows);
                map.put("code", "0");
                map.put("msg", "查询成功");
            } else {
                map.put("code", "1");
                map.put("msg", "暂无数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping(value = {"findDeploymentList"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public List<Workflow> findDeploymentList() {
        Map<String, Object> map = new HashMap();
        List<Workflow> workflows = new ArrayList();
        try {
            List<ProcessDefinition> processDefinitions = this.workFlowService.findDeploymentList();
            if ((processDefinitions != null) && (processDefinitions.size() > 0)) {
                for (ProcessDefinition processDefinition : processDefinitions) {
                    Workflow bean = new Workflow();
                    bean.setId(processDefinition.getId());
                    bean.setName(processDefinition.getName());
                    bean.setKey(processDefinition.getKey());
                    bean.setDeploymentID(processDefinition.getDeploymentId());
                    bean.setVersion(processDefinition.getVersion());
                    bean.setDiagramResourceName(processDefinition.getDiagramResourceName());
                    workflows.add(bean);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return workflows;
    }

    @RequestMapping(value = {"getWorkFlowImage"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public void getWorkFlowImage(Workflow workflow, HttpServletResponse response) {
        String deploymentId = workflow.getDeploymentID();
        try {
            List<String> resources = this.processEngine.getRepositoryService().getDeploymentResourceNames(deploymentId);

            String imgName = "";
            if ((resources != null) && (resources.size() > 0)) {
                for (String string : resources) {
                    if (string.indexOf("png") >= 0) {
                        imgName = string;
                    }
                }
            }
            if (StringUtils.isNotEmpty(imgName)) {
                InputStream imageStream = this.processEngine.getRepositoryService().getResourceAsStream(deploymentId, imgName);

                byte[] b = new byte[1024];
                int len;
                while ((len = imageStream.read(b, 0, 1024)) != -1) {
                    response.getOutputStream().write(b, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}