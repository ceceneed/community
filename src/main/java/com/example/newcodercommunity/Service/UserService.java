package com.example.newcodercommunity.Service;

import com.example.newcodercommunity.dao.UserMapper;
import com.example.newcodercommunity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
