package com.graduate.law.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2Controller {
    @ApiOperation(value ="oauth2登录")
    @RequestMapping("/getUserByToken/{token}")
    public String accessToken(@PathVariable String token){
//        RedisTokenStore redisTokenStore = new RedisTokenStore(redisConnectionFactory);
//        OAuth2AccessToken oAuth2AccessToken = redisTokenStore.readAccessToken("28e24778-c97c-41cb-aba5-60bc4af21edb");
//        OAuth2Authentication oAuth2Authentication = redisTokenStore.readAuthentication(oAuth2AccessToken);
//        Authentication userAuthentication = oAuth2Authentication.getUserAuthentication();
//        Object details = userAuthentication.getDetails();
//        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(details));
//        String username = (String) jsonObject.get("username");
        return null;
    }
}
