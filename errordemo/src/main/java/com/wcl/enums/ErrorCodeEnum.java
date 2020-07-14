package com.wcl.enums;

public enum ErrorCodeEnum {
    OK(0, "成功"),
    MISS_TOKEN(-1, "缺少token"),
    REQUIRE_LOGIN(-2, "没有登陆"),
    MISS_PARAMETER(-3, "缺少参数");
    private int    error;
    private String errmsg;

    private ErrorCodeEnum(int error, String errmsg) {
        this.error = error;
        this.errmsg = errmsg;
    }

    public int getError() {
        return error;
    }

    public String getErrmsg() {
        return errmsg;
    }

    }
