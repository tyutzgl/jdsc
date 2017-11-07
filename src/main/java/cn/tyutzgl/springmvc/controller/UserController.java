package cn.tyutzgl.springmvc.controller;

import cn.tyutzgl.springmvc.pojo.User;
import cn.tyutzgl.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public String login(HttpServletRequest request){

        HttpSession httpsession = request.getSession();

        httpsession.invalidate();

        return "login";
    }

    @RequestMapping("/loginCheck")
    public String loginCheck(User user,HttpServletRequest request){

        boolean loginType = userService.login(user.getUsername(),user.getPassword());

        HttpSession session = request.getSession();

        if(loginType){

            session.setAttribute("user",user);

            return "redirect:/adCtr";
        }else{
            request.setAttribute("message","用户名密码错误");
            return "/login";
        }

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
