package com.imooc.miaosha.util;

import java.util.UUID;

/**
 * Author:%{USER}
 * Date:%{DATE}
 **/
public class UUIDUtil {

    public static String uuid(){
        return UUID.randomUUID().toString().replace("_","");
    }
}
