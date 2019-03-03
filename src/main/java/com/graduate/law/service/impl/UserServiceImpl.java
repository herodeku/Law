package com.graduate.law.service.impl;

import com.graduate.law.bean.CustomUserDetails;
import com.graduate.law.bean.LawUser;
import com.graduate.law.bean.User;
import com.graduate.law.dao.UserMapper;
import com.graduate.law.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.getUserByUserName(s);
        return new CustomUserDetails(user);
    }

    @Override
    public User getUserByUserName(String s) {
        return userMapper.getUserByUserName(s);
    }

    @Override
    public LawUser getUserByUserNameExcludePassWord(String s) {
        return userMapper.getUserByUserNameExcludePassWord(s);
    }
}
