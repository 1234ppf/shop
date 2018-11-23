package com.ssm.shop.login.serviceImpl;

import com.ssm.api.common.Resultful;
import com.ssm.api.common.enums.LOGIN;
import com.ssm.api.common.request.LoginRequest;
import com.ssm.api.service.UserService;
import com.ssm.api.bean.User;
import com.ssm.shop.login.dao.userMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private userMapper userDao;

    public Resultful loginVerify(LoginRequest loginRequest) {
        System.out.println(loginRequest.toString());
        String username=loginRequest.getUsername();
        String passWord=loginRequest.getPassword();
        Resultful result=new Resultful();
        //判断参数是否合法
        if(passWord==null||("").equals(passWord)
                ||username==null||("").equals(username)){
            result.setCode(LOGIN.ILLEGAL_PARAMETER.getCode());
            result.setMsg(LOGIN.ILLEGAL_PARAMETER.getMsg());
            result.setSuccess(false);
            return result;
        }
        //查找该用户
        User returnUser = userDao.selectUserByName(username);
        //若不存在用户
        if(returnUser==null||returnUser.equals("")){
            result.setCode(LOGIN.USER_NOT_EXIST.getCode());
            result.setMsg(LOGIN.USER_NOT_EXIST.getMsg());
            result.setSuccess(false);
            return result;
        }
        String returnUserPassword=returnUser.getPassword();
        //判断密码是否符合
        if (returnUserPassword==passWord||returnUserPassword.equals(passWord)){
            result.setCode(LOGIN.SUCCESS.getCode());
            result.setMsg(LOGIN.SUCCESS.getMsg());
            result.setSuccess(true);
            return result;
        }else{
            result.setCode(LOGIN.PASSWORD_UUU.getCode());
            result.setMsg(LOGIN.PASSWORD_UUU.getMsg());
            result.setSuccess(false);
            return result;
        }
    }

}