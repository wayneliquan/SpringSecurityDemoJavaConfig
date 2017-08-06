package com.wayne.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by zhanliquan on 17-8-6.
 * Description:
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 配置登录有关的权限
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("123").roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/home").hasRole("USER");
        // 下面两种配置等价
//        http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN");
        http.authorizeRequests().antMatchers("/admin").access("hasRole('ROLE_ADMIN')"); //基于表达式的写法

        http.authorizeRequests().antMatchers("/**/*.html").permitAll();
        http.authorizeRequests().antMatchers("/**/*.js").access("permitAll"); //基于表达式的写法
        http.authorizeRequests().antMatchers("/**/*.css").permitAll();

        http.authorizeRequests().antMatchers("/**").access("authenticated");
        http.formLogin();
    }
}
