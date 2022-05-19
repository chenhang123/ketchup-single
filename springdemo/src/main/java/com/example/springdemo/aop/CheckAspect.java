package com.example.springdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckAspect {

    @Pointcut("execution(* com.example.springdemo.controller.HelloController.*(..))")
    public void pointcut(){
        System.out.println("pointcut");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("ffffuck before");
        Object object = point.proceed();
        System.out.println("ffffuck after");
        return object;
    }

    @Before("pointcut()")
    public void before() throws Throwable {
        System.out.println("before before");
    }

}
