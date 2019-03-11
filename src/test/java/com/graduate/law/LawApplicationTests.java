package com.graduate.law;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.graduate.law.util.LawException;
import com.graduate.law.util.ResultCode;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.Soundbank;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LawApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    @Test
    public void blob(){
        RedisTokenStore redisTokenStore = new RedisTokenStore(redisConnectionFactory);
        OAuth2AccessToken oAuth2AccessToken = redisTokenStore.readAccessToken("c01f419a-2436-482e-a749-607e5da64aab");
        OAuth2Authentication oAuth2Authentication = redisTokenStore.readAuthentication(oAuth2AccessToken);
        Authentication userAuthentication = oAuth2Authentication.getUserAuthentication();
        Object details = userAuthentication.getDetails();
        System.out.println(details);
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(details));
        String username = (String) jsonObject.get("username");
        System.out.println(username);
    }
    @Test
    public void construct(){
        new LawException(ResultCode.SCUUESS);
    }
}

