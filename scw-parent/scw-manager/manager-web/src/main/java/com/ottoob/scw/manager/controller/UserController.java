package com.ottoob.scw.manager.controller;

import com.ottoob.scw.manager.bean.User;
import com.ottoob.scw.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello(@RequestParam("id") Integer id, Model model) {

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
        System.out.println("-------------------MVC---------------");
        System.out.println("SpringMVC---->"+applicationContext);
        System.out.println("-------------------MVC---------------");
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "success";
    }
}
