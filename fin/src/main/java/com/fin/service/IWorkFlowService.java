package com.fin.service;

import com.fin.bean.Workflow;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IWorkFlowService {
    /**
     * 新增工作流
     * @return
     * @param file 工作流压缩包
     */
    boolean saveNewDeploye(MultipartFile file);

    /**
     * 获取工作流列表
     * @param page 当前页码
     * @param limit 每页最大记录数
     * @return
     */
    List<ProcessDefinition> findDeploymentListByPage(Integer page, Integer limit,Workflow workflow);

    /**
     * 获取列表
     * @return
     */
    List<ProcessDefinition> findDeploymentList();
}
