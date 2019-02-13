package com.graduate.law.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/druid/*");
        //    http.authorizeRequests().antMatchers("/").permitAll();
        //             .antMatchers("/level1/**").hasRole("VIP1");
        http.formLogin().loginPage("");//默认来到/login页面action="/login",如果loginpage改变了，则和loginpage一致
        http.logout().logoutSuccessUrl("");//action="/logout"
        http.rememberMe();
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.jdbcAuthentication().dataSource(dataSource)
//                .usersByUsernameQuery("select username,password,true from user where username=?")
//                .authoritiesByUsernameQuery("select username,role from user where username=?")
//                .passwordEncoder(new BCryptPasswordEncoder());
////    auth.inMemoryAuthentication()
////            .passwordEncoder(new BCryptPasswordEncoder())
////            .withUser("123")
////            .password(new BCryptPasswordEncoder()
////                    .encode("123")).roles("VIP1");
//    }
}
