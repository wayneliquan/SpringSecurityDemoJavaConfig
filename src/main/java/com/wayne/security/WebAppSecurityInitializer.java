package com.wayne.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Created by zhanliquan on 17-8-6.
 * Description: spring security 启动的类
 */
public class WebAppSecurityInitializer extends AbstractSecurityWebApplicationInitializer
{

    /**
     * spring mvc 的dispatcher的名字。 曾经在web.xml有使用到
     * @return
     */
    protected String getDispatcherWebApplicationContextSuffix() {
        return AbstractDispatcherServletInitializer.DEFAULT_SERVLET_NAME;
    }
}
