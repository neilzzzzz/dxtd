package com.ydl.sms.utils;

public class DesensitizationUtil {
	// 手机号码中间四位数字脱敏
    public static String mobileEncrypt(String mobile) {
        return mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }
    //身份证号脱敏
    public static String idEncrypt(String id) {
        return id.replaceAll("(?<=\\w{3})\\w(?=\\w{4})", "*");
    }
}
