package com.ssm.api.common.enums;

/**
 * 登录返回状态枚举
 */
public enum LOGIN {


    /**
     * 登录成功
     */
    SUCCESS("10000", "登陆成功"),
    /**
     * 缺少必选参数
     */
    MISS_PARAMETER("10001", "参数缺失"),
    /**
     * 非法参数
     */
    ILLEGAL_PARAMETER("10002", "参数非法"),

    /**
     * 用户不存在
     */
    USER_NOT_EXIST("10003", "用户不存在"),

    /**
     * 密码错误
     */
    PASSWORD_UUU("10004", "密码错误");


    /**
     * 错误码
     */
    private String code;

    /**
     * 错误码描述
     */
    private String msg;

    LOGIN(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }
}
