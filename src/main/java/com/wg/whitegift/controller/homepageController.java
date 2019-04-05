package com.wg.whitegift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class homepageController {
    @RequestMapping("/homePage")
    public String welcome(Map <String,Object> user){
        user.put("wel","thanks for using our web");
        return "welcome";
    }

}
