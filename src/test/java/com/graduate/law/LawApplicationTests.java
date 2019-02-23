package com.graduate.law;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
       //redisTemplate.boundValueOps("name").set("xiaoming");
        //System.out.println(redisTemplate.opsForValue().get("name"));
//        RedisTokenStore redisTokenStore = new RedisTokenStore(redisConnectionFactory);
//        OAuth2AccessToken oAuth2AccessToken = redisTokenStore.readAccessToken("28e24778-c97c-41cb-aba5-60bc4af21edb");
//        OAuth2Authentication oAuth2Authentication = redisTokenStore.readAuthentication(oAuth2AccessToken);
//        Authentication userAuthentication = oAuth2Authentication.getUserAuthentication();
//        Object details = userAuthentication.getDetails();
//        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(details));
//        String username = (String) jsonObject.get("username");
//        System.out.println(username);
    }
}

