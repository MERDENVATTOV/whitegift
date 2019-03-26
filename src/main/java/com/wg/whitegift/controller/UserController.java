package com.wg.whitegift.controller;

import com.wg.whitegift.entity.MyUser;
import com.wg.whitegift.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
