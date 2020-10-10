package com.jullia.hibernatedemorelations.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    @ResponseBody
    public List<User> getUSers(){
        return userService.getUserList();
    }

    @GetMapping("/usersDummyInfo")
    @ResponseBody
    public User addDummyInfo(){
        return userService.addDummyInfo();
    }
}
