package com.imooc.miaosha.result;

import lombok.Getter;

@Getter
public enum ResultEnum {

    SUCCESS(0,"成功"),
    ERROR(1,"失败"),
    SERVER_ERROR(500100,"服务器端异常:,%s"),

    SESSION_ERROR(500210,"session不存在或已失效"),
    PASSWORD_EMPTY(500211,"密码不能为空"),
    MOBILE_EMPTY(500212,"手机号不能为空"),
    MOBILE_ERROR(500213,"手机号码格式错误"),
    MOBILE_NOT_EXIT(500214,"手机号不存在"),
    PASSWORD_ERROR(500215,"密码错误"),

    ;

    private int code;

    private String message;


    ResultEnum(Integer code, String message,Object... args) {
        this.code = code;
        this.message = String.format(message,args);
    }

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
