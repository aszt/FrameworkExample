package com.fin.common;

public class FormBuilder {
    public static String getMerchantNo(String type, int seq) {
        String dateStr = type;
        dateStr += CrcUtil.getCurDate("yyyyMMdd");
        dateStr += CrcUtil.fillChar(new Integer(seq).toString(), '0', 6, true);
        return dateStr;
    }
}
