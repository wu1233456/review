package com.wcl.controller;

import com.wcl.utils.ResultBean;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
//处理404错误
@Controller
@ResponseBody
class ErrorPageController implements ErrorController {

    @RequestMapping("/error")
    public ResultBean handleError(HttpServletRequest request){
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

        if(statusCode == 401){
            return new ResultBean(-1,"401");
        }else if(statusCode == 404){
            return  new ResultBean(-1,"404");
        }else if(statusCode == 403){
            return  new ResultBean(-1,"405");
        }else{
            return  new ResultBean(-1,"未知错误");
        }

    }

    @Override
    public String getErrorPath() {
        return null;
    }
}