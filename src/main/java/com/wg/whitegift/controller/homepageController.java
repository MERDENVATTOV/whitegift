package com.wg.whitegift.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class homepageController {
    @RequestMapping("/homePage")
    @ResponseBody
    public String welcome(Map <String,Object> user){
        user.put("wel","thanks for using our web");
        return "welcome";
    }

}
