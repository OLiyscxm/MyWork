package com.zym.boot.model.demo.controller;

import com.zym.boot.model.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @MyFunction
 */
@Controller
public class DeleteController {
    @Autowired
    MainService mainService;
    @GetMapping("/delete/{lostId}")
    public String delete(@PathVariable("lostId") Integer lostId){
        mainService.delete(lostId);
        return "redirect:/table";
    }
}
