package com.wayne.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zhanliquan on 17-8-6.
 * Description:
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**/*.html").addResourceLocations("/public");
        registry.addResourceHandler("/**/*.css").addResourceLocations("/public");
        registry.addResourceHandler("/**/*.js").addResourceLocations("/public");
        registry.addResourceHandler("/**/*.jsp").addResourceLocations("/");
    }
}
