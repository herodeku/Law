package com.graduate.law.service;

import com.graduate.law.bean.LawUser;
import com.graduate.law.bean.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User getUserByUserName(String s);
    public LawUser getUserByUserNameExcludePassWord(String s);
    public String register(LawUser user);
}
