package com.advice;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
    //目标方法执行前执行的操作
    //JoinPoint jp用于接收方法传入的参数（数组形式）
    public void doBefore(JoinPoint jp){
        System.out.println("====开始日志===="+jp.getArgs()[0]);
    }
}
