package cn.tyutzgl.springmvc.service;

import cn.tyutzgl.springmvc.mapper.UserMapper;
import cn.tyutzgl.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public List<User> queryUserList() {
        return this.userMapper.selectByExample(null);
    }

    @Override
    public boolean login(String username, String password) {

        User user = this.userMapper.selectByName(username);

        if (user != null){
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                return true;
        }

        return false;
    }
}
