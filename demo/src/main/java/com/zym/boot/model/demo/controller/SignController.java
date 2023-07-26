package com.zym.boot.model.demo.controller;

import com.zym.boot.model.demo.pojo.User;
import com.zym.boot.model.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @MyFunction
 */
@Controller
public class SignController {
    @Autowired
    MainService mainService;
    @PostMapping("/signup")
    public String signup(User user){
        mainService.signInsert(user);
        return "main";
    }
}
