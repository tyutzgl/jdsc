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

    @Qualifier("itemServiceImpl")
    @Autowired
    private  ItemService itemService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/index")
    public String hello( ModelMap modelMap){
        // 根据id查询商品数据
        List<Items> list = this.itemService.queryItemList();

        modelMap.addAttribute("list",list);

        return "index";
    }
}
