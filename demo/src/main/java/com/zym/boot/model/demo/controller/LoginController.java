package com.zym.boot.model.demo.controller;

import com.zym.boot.model.demo.pojo.User;
import com.zym.boot.model.demo.pojo.Lost;
import com.zym.boot.model.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @MyFunction
 */
@Controller
public class LoginController {

    @Autowired
    MainService mainService;

    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String mainPage(User user, HttpSession session, Model model){
        if(!(StringUtils.isEmpty(user.getUsername())&&StringUtils.isEmpty(user.getPassword()))&&mainService.select(user)!=null){
            session.setAttribute("loginUser",user);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误!");
            return "login";
        }

    }

    @GetMapping("/main.html")
    public String goMain(HttpSession session,Model model){
//        if(session.getAttribute("loginUser")!=null){
//            return "main";
//        }
//        else {
//            model.addAttribute("msg","请重新登录!");
//            return "login";
//        }
        return "main";
    }




}
