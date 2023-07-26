package com.zym.boot.model.demo.controller;

import com.zym.boot.model.demo.pojo.Lost;
import com.zym.boot.model.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @MyFunction
 */
@Controller
public class AddController {
    @Autowired
    MainService mainService;
    @PostMapping("/add")
    public String add(@ModelAttribute Lost lost){
       mainService.insert(lost);
       return "redirect:/table";
    }

}
