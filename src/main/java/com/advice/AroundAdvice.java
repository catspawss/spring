package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 环绕通知
 */
//@Aspect用于说明切面注解，配置文件中需要开始自动代理
//    环绕通知能决定拦截下的方法是否调用，甚至可以把拦截方法的返回值也改变
@Component
@Aspect
public class AroundAdvice {
    //@Around("execution(* com.service.*.*(..))")说明是一个环绕通知
    //* com.service.*.*(..))对应 任意返回值，哪个包下的哪个类的哪个方法，(..)表示任意参数
    @Around("execution(* com.service.*.*(..))")
    public Object doAround(ProceedingJoinPoint jp){
        //获得方法传入的参数
        Object[] args = jp.getArgs();
        System.out.println(args[0]+"\t"+args[1]);
        System.out.println("========这是环绕通知======");
        Object result=null;
        try {
            //表示允许拦截的方法运行,返回值就是拦截方法本来的返回值
            //当有操作在这，表示前置通知
            //当方法执行前，修改原有的参数，最后结果会改变
            result = jp.proceed(new Integer[]{4,5});
            //当有操作在这，表示后置通知，与异常通知互斥
        } catch (Throwable throwable) {
            //当有操作在这，表示异常通知，与后置通知互斥
            throwable.printStackTrace();
        }finally{
            //当有操作在这，表示最终通知
        }
        return result;
    }
}
