package cn.tyutzgl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
