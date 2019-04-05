package com.wg.whitegift.controller;

import com.wg.whitegift.entity.MyUser;
import com.wg.whitegift.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    MyUserRepository userRepository;
    @GetMapping("/user/{id}")
    public MyUser getUser(@PathVariable("id")Integer id){
        MyUser user = userRepository.findMyUserById(id);
        return user;
    }

    public MyUser insertUser(MyUser user){
        MyUser save = userRepository.save(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.GET)

    public String getUserList(ModelMap map) {

        map.addAttribute("userList", userRepository.findAll());

        return "userList";

    }
}
