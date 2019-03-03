package com.graduate.law.controller;

import com.alibaba.fastjson.JSONObject;
import com.graduate.law.service.UserService;
import com.graduate.law.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Oauth2")
@Api(description = "操作用户")
public class Oauth2Controller {

    @Autowired
    private UserService userService;

    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    @ApiOperation(value ="oauth2登录")
    @GetMapping("/getUserByToken/{token}")
    public ResultUtil accessToken(@PathVariable String token){
        RedisTokenStore redisTokenStore = new RedisTokenStore(redisConnectionFactory);
        OAuth2AccessToken oAuth2AccessToken = redisTokenStore.readAccessToken(token);
        OAuth2Authentication oAuth2Authentication = redisTokenStore.readAuthentication(oAuth2AccessToken);
        Authentication userAuthentication = oAuth2Authentication.getUserAuthentication();
        Object details = userAuthentication.getDetails();
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(details));
        String username = (String) jsonObject.get("username");
        return ResultUtil.success(userService.getUserByUserNameExcludePassWord(username));
    }
}
