package com.ck.shiro.service;

import com.ck.domain.entity.UserEntity;
import com.ck.manager.ShiroManager;
import com.ck.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private ShiroManager shiroManager;



    @Override
    public UserEntity getUserById(long userId) {
        UserEntity entity = new UserEntity();
        entity.setUserId(9L);
        entity.setUserName("ck");
        entity.setPassword("123456");
        entity.setStatus(0);
        return entity;
    }

    @Override
    public UserEntity getUserByName(String userName) {
        UserEntity entity = new UserEntity();
        entity.setUserId(9L);
        entity.setUserName("ck");
        entity.setPassword("123456");
        entity.setStatus(0);
        return entity;
    }
}
