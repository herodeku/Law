package com.graduate.law.dao;

import com.graduate.law.bean.LawUser;
import com.graduate.law.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from USER where username=#{s}")
    public User getUserByUserName(String s);

    @Select("select username,authority,sex,age,nickname,phone from USER where username=#{s}")
    public LawUser getUserByUserNameExcludePassWord(String s);

    @Insert("insert into USER values(#{username},#{password},#{authority},#{sex},#{age},#{phone},#{nickname})")
    public int addUser(LawUser user);
}
