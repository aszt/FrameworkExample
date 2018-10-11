package com.fin.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 系统参数
 */
@Service
public class CommonService {

    // token参数
    @Value("${USER_REDIS_KEY}")
    public String USER_REDIS_KEY;

    @Value("${COOKIE_NAME}")
    public String COOKIE_NAME;

    //七牛云参数
    @Value("${QINIU_CLOUD_DOMAIN}")
    public String QINIU_CLOUD_DOMAIN;

    @Value("${QINIU_ACCESS_KEY}")
    public String QINIU_ACCESS_KEY;

    @Value("${QINIU_SECRET_KEY}")
    public String QINIU_SECRET_KEY;

    @Value("${QINIU_BUCKET_NAME}")
    public String QINIU_BUCKET_NAME;
}
