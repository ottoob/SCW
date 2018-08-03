package com.ottoob.scw.manager.service.impl;

import com.ottoob.scw.manager.bean.User;
import com.ottoob.scw.manager.mapper.UserMapper;
import com.ottoob.scw.manager.service.UserService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("=====================spring===============");
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }

        System.out.println("=====================spring===============");
        System.out.println("spring------>"+applicationContext);
        return userMapper.selectByPrimaryKey(id);
    }
}
