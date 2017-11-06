package cn.tyutzgl.springmvc.controller;

import cn.tyutzgl.springmvc.pojo.Items;
import cn.tyutzgl.springmvc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {

    private final ItemService itemService;

    @Autowired
    public UserController(@Qualifier("itemServiceImpl") ItemService itemService) {
        this.itemService = itemService;
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

}
