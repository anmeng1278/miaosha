package com.imooc.miaosha.util;

import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtils {

    private static final Pattern mobile_pattern = Pattern.compile("1\\d{10}");

    public static boolean isMobile(String src){
        if(StringUtils.isEmpty(src)){
            return false;
        }
        Matcher match = mobile_pattern.matcher(src);
        return match.matches();
    }

/*    public static void main(String[] a){
        System.out.println(isMobile("12334433"));
        System.out.println(isMobile("18912341234"));

    }*/
}
