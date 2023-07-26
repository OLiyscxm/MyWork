package com.zym.boot.model.demo.config;

import com.zym.boot.model.demo.interceptor.PreInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @MyFunction
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new PreInterceptor());
        registration.addPathPatterns("/**");
        registration.excludePathPatterns("/login","/","/**/*.html");
    }
}
