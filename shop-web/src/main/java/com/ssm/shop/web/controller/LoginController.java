package com.ssm.shop.web.controller;

import com.ssm.api.common.Resultful;
import com.ssm.api.common.enums.LOGIN;
import com.ssm.api.common.request.LoginRequest;
import com.ssm.api.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
@RequestMapping("/sys")
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method=RequestMethod.POST,consumes = "application/json",produces = {"text/html;charset=utf-8"})
    @ResponseBody
    public Resultful login(@RequestBody LoginRequest loginRequest){
        //若参数为空，则返回
        Resultful result=null;
        if(loginRequest==null||("").equals(loginRequest)){
            result.setCode(LOGIN.MISS_PARAMETER.getCode());
            result.setMsg(LOGIN.MISS_PARAMETER.getMsg());
            result.setSuccess(false);
            return result;
        }
        result = userService.loginVerify(loginRequest);
        return result;
    }
}
