package com.zym.boot.model.demo.controller;

import com.zym.boot.model.demo.pojo.Lost;
import com.zym.boot.model.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @MyFunction
 */
@Controller
public class TableController {
    @Autowired
    MainService mainService;

    @GetMapping("/table")
    public String goTable(Model model){

        List<Lost> list =mainService.main();
        model.addAttribute("lostMsg",list);
        return "table";
    }


}
