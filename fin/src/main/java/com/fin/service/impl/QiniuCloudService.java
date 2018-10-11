package com.fin.service.impl;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

@Component
public class QiniuCloudService {
    
    @Value("${QINIU_BUCKET_NAME}")
    private String bucketname;
    @Value("${QINIU_ACCESS_KEY}")
    private String ACCESS_KEY;
    @Value("${QINIU_SECRET_KEY}")
    private String SECRET_KEY;

    public String getUpToken(String fileName) {
        StringMap map = new StringMap();
        map.putNotEmpty("saveKey", fileName);
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        return auth.uploadToken(bucketname, null, 360 * 3600000, map, true);
    }

    public String getUpToken() {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        return auth.uploadToken(bucketname);
    }

    public String upload(File file, String domainStr) throws IOException {
        String url = null;
        String key = file.getName();
        UploadManager uploadManager = new UploadManager();
        try {
            // 覆盖图片
            Response res = uploadManager.put(file, key, getUpToken(key));
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, String> maps = objectMapper.readValue(res.bodyString(), Map.class);

            url = domainStr + maps.get("key");
            // 打印返回的信息
            System.out.println("url:" + url);

            return url;
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                // 响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                // ignore
            }
        }
        return url;
    }

    public String upload(File file, String domainStr, String extension) throws IOException {
        String url = null;
        String key = file.getName();
        if ("pdf".equals(extension)) {
            //说明是pdf格式的
            key = key.replaceAll(".tmp", ".pdf");
        }

        if ("jpg".equals(extension)) {
            //说明是pdf格式的
            key = key.replaceAll(".tmp", ".jpg");
        }
        UploadManager uploadManager = new UploadManager();
        try {
            // 覆盖图片
            Response res = uploadManager.put(file, key, getUpToken(key));
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, String> maps = objectMapper.readValue(res.bodyString(), Map.class);

            url = domainStr + maps.get("key");
            // 打印返回的信息
            System.out.println("url:" + url);

            return url;
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                // 响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                // ignore
            }
        }
        return url;
    }

    public String upload(MultipartFile file, String domainStr) throws IOException {
        String url = null;
        String fileName = file.getOriginalFilename();
        String prefix = fileName.substring(fileName.lastIndexOf(".") + 1);
        String key = new Date().getTime() + "." + prefix;
//		String key = file.getOriginalFilename();
        System.out.println(key);
        UploadManager uploadManager = new UploadManager();
        try {

            Response res = uploadManager.put(file.getBytes(), key, getUpToken(key));
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, String> maps = objectMapper.readValue(res.bodyString(), Map.class);

            url = domainStr + maps.get("key");
            // 打印返回的信息
            System.out.println(url);

            return url;
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                // 响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                // ignore
            }
        }
        return url;
    }

    public String upload(MultipartFile file, String domainStr, String name) throws IOException {
        String url = null;
        //String key = file.getOriginalFilename();
//		System.out.println(key);
        UploadManager uploadManager = new UploadManager();
        try {

            //Response res = uploadManager.put(file.getBytes(), name, getUpToken(name));
            Response res = uploadManager.put(file.getBytes(), name, getUpToken());
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, String> maps = objectMapper.readValue(res.bodyString(), Map.class);

            url = domainStr + maps.get("key");
            // 打印返回的信息
            System.out.println(url);

            return url;
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                // 响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                // ignore
            }
        }
        return url;
    }

    public String upload(String filePath, String fileName, String domainStr) throws IOException {
        String url = null;
        String key = fileName;
        System.out.println(key);
        UploadManager uploadManager = new UploadManager();
        try {

            //Response res = uploadManager.put(filePath, key, getUpToken(fileName));
            Response res = uploadManager.put(filePath, key, getUpToken());
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, String> maps = objectMapper.readValue(res.bodyString(), Map.class);

            url = domainStr + maps.get("key");
            // 打印返回的信息
            System.out.println(url);

            return url;
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                // 响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                // ignore
            }
        }
        return url;
    }

}
