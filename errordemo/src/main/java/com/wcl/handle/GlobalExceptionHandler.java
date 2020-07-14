package com.wcl.handle;
import com.wcl.utils.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
//处理运行错误
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    private static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //运行时异常
    @ExceptionHandler(RuntimeException.class)
    public ResultBean runtimeExceptionHandler(RuntimeException ex) {
       return new ResultBean(-1,"未知错误");
    }
    //400错误
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResultBean requestNotReadable(HttpMessageNotReadableException ex) {
        return new ResultBean(-1, "找不到对应的页面");
    }


}


