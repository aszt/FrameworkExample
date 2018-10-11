package com.fin.common;

import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CrcUtil {
    public static File getFormFile() {
        return new File("");
    }

    /**
     * 生成md5
     *
     * @param message
     * @return
     */
    public static String getMD5(String message, String charSet) {
        String md5str = null;
        if (message == null) {
            return null;
        }
        try {
            md5str = DigestUtils.md5DigestAsHex(message.getBytes(charSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5str;
    }

    /**
     * 生成md5
     *
     * @param message
     * @return
     */
    public static String getMD5(String message) {
        String md5str = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] input = message.getBytes();

            byte[] buff = md.digest(input);
            md5str = bytesToHex(buff);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5str;
    }

    /**
     * 二进制转十六进制
     *
     * @param bytes
     * @return
     */
    private static String bytesToHex(byte[] bytes) {
        StringBuffer md5str = new StringBuffer();

        int digital;
        for (int i = 0; i < bytes.length; i++) {
            digital = bytes[i];
            if (digital < 0) {
                digital += 256;
            }
            if (digital < 16) {
                md5str.append("0");
            }
            md5str.append(Integer.toHexString(digital));
        }
        return md5str.toString().toUpperCase();
    }

    public static Date getCurrTime() {
        return Calendar.getInstance().getTime();
    }

    public static String getDateStr(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        return sdf.format(date);

    }

    public static String getCurDate(String pattern) {
        Date d = Calendar.getInstance().getTime();
        return getDateStr(d, pattern);
    }

    public static String fillChar(String org, char fillCh, int length, boolean left) {
        while (org.length() < length) {
            if (left) {
                org = fillCh + org;
            } else {
                org += fillCh;
            }
        }

        if (org.length() > length) {
            org = org.substring(org.length() - length - 1);
        }

        return org;
    }

    public static Date parseDate(String pattern, String src) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(src);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String covertStr(String org, char ch) {
        if (org.length() == 8) {
            if (org.charAt(0) > 47 && org.charAt(0) < 58) {
                StringBuffer sb = new StringBuffer(org);
                sb.insert(6, ch);
                sb.insert(4, ch);
                return sb.toString();
            }

        }
        return org;

    }

    public static String getIPAddr(HttpServletRequest request) {
        if (request == null)
            return null;
        String ip = request.getHeader("X-Forwarded-For");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            ip = request.getHeader("Proxy-Client-IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            ip = request.getHeader("WL-Proxy-Client-IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            ip = request.getHeader("HTTP_CLIENT_IP");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip))
            ip = request.getRemoteAddr();
        if ("127.0.0.1".equals(ip) || "0:0:0:0:0:0:0:1".equals(ip))
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException unknownhostexception) {
            }
        return ip;
    }
}
