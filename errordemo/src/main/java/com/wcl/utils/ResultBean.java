package com.wcl.utils;

import com.wcl.enums.ErrorCodeEnum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResultBean implements Serializable {
    /*操作成功但无返回数据时使用这个*/
    public static final ResultBean OK = new ResultBean(new HashMap<>());
    /*实现序列化必须要加上的*/
    private static final long   serialVersionUID = 1L;

    private static final int    SUCCESS          = 0;
    private static final String SUCCESS_MSG      = "";
    //返回码
    public int error = 0;

    //消息提示
    public String errmsg = "";

    //数据
    public Map<String, Object> data = new HashMap<>();
    /*成功时直接通过返回相应的数据*/
    public ResultBean(Map<String, Object> data) {
        super();

        this.error = ResultBean.SUCCESS;
        this.errmsg = ResultBean.SUCCESS_MSG;
        this.data = data;
    }
    /*发生异常时通过枚举类来返回,无需数据*/
    public ResultBean(ErrorCodeEnum eenum) {
        super();
        this.error = eenum.getError();
        this.errmsg = eenum.getErrmsg();
        this.data = new HashMap<>();
        ;
    }
    /*通过自定义的状态码以及信息返回*/
    public ResultBean(int error, String errmsg, Map<String, Object> data) {
        this.error = error;
        this.errmsg = errmsg;
        this.data = data;
    }
    public ResultBean(int error, String errmsg) {
        this.error = error;
        this.errmsg = errmsg;
    }
}

