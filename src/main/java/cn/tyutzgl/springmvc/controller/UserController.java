package cn.tyutzgl.springmvc.controller;

import cn.tyutzgl.springmvc.pojo.User;
import cn.tyutzgl.springmvc.service.ItemService;
import cn.tyutzgl.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/adCtr")
    public String hello(){


        return "index";
    }

    @RequestMapping("/user/userList")
    public String queryUserList(ModelMap modelMap){

        List<User> userlist = this.userService.queryUserList();

        modelMap.addAttribute("userlist", userlist);

        return "userInfo";
    }

}
