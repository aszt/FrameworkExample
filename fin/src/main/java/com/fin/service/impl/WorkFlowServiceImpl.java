package com.fin.service.impl;

import com.fin.bean.Workflow;
import com.fin.service.IWorkFlowService;
import org.activiti.engine.*;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.repository.ProcessDefinition;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipInputStream;

@Service
@Transactional
public class WorkFlowServiceImpl implements IWorkFlowService {
    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private IdentityService identityService;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private ProcessEngine processEngine;

    @Autowired
    private HistoryService historyService;

    public boolean saveNewDeploye(MultipartFile file) {
        String filename = file.getOriginalFilename();
        // 获得文件后缀名
        String extension = FilenameUtils.getExtension(filename);
        // 获得部署引擎
        DeploymentBuilder deploy = processEngine.getRepositoryService().createDeployment();
        // 得到上传文件的输入流
        InputStream in = null;
        try {
            // 2：将File类型的文件转化成ZipInputStream流
            in = file.getInputStream();
            if ("zip".equals(extension) || "bar".equals(extension)) {
                deploy.addZipInputStream(new ZipInputStream(in));
            } else {
                deploy.addInputStream(filename, in);
            }
            // 进行部署
            deploy.deploy();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<ProcessDefinition> findDeploymentListByPage(Integer page, Integer limit, Workflow workflow) {
        if(StringUtils.isNotEmpty(workflow.getName())) {
            return this.repositoryService.createProcessDefinitionQuery().processDefinitionNameLike(workflow.getName()).listPage((page-1)*limit, limit);
        } else {
            return this.repositoryService.createProcessDefinitionQuery().listPage((page-1)*limit, limit);
        }
    }

    public List<ProcessDefinition> findDeploymentList() {
        return this.repositoryService.createProcessDefinitionQuery().list();
    }
}
