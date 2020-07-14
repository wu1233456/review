package com.wcl.controller;

import com.wcl.utils.ResultBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class testController {
    @RequestMapping("/testError")//注意一定不要写error，因为默认这个路径已经被使用了
    public ResultBean testError(){
        if (1 > 0) {
            throw new RuntimeException();
        }
//        return "hello";
        return ResultBean.OK;//注意这里是不需要new的,因为这个是静态变量
    }
}
