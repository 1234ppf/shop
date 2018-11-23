package com.ssm.shop.login.dao;

import com.ssm.api.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectUser(Integer userId);

    List<User>  selectAll();

    List<User>  selectElse(User user);

    User selectUserByName(String username);
}