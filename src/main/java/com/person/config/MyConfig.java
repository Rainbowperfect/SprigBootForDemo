package com.person.config;

import com.person.interceptor.MyInterceptor;
import com.person.interceptor.MyInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @version 1.0
 * @description com.person.config
 * @date 2017-8-17
 */
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/**");
        registry.addInterceptor(new MyInterceptor2());
        super.addInterceptors(registry);
    }
}
