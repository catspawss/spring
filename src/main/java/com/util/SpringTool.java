package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTool {
    //1。加载spring核心配置文件,ctx为核心对象
    private static final String CONF_FILE = "config/applicationContext.xml";
    private static ApplicationContext ctx;
    static{
        ctx=new ClassPathXmlApplicationContext(CONF_FILE);
    }

    public static Object getBean(String beanId){
        return ctx.getBean(beanId);
    }
}
