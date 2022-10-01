package com.advice;

import org.aspectj.lang.JoinPoint;

public class AfterAdvice {
    //目标方法执行后执行的操作
    //Object result用于接收方法返回值
    public void doAfter(JoinPoint jp,Object result){
        System.out.println("====结束日志===="+result);
    }
}
