package cn.tyutzgl.springmvc.service;

import cn.tyutzgl.springmvc.pojo.User;

import java.util.List;

public interface UserService {

    List<User> queryUserList();

    boolean login(String username,String password);
}
