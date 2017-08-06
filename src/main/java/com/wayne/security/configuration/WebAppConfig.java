package com.wayne.security.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zhanliquan on 17-8-6.
 * Description:
 */
@EnableWebMvc
@EnableWebSecurity
@ComponentScan("com.wayne.security")
public class WebAppConfig {
}
