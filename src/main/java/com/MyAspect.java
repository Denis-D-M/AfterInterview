package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

//    @Before("execution(* Person.*(..))")
//    public void BeforeAdvice(JoinPoint joinPoint){
//        System.out.println("I'm doing some logging on: " + joinPoint.getSignature().getName());
//    }

    @Around("@annotation(Logging)")
    public Object AroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("I'm doing something on: " + joinPoint.getSignature().getName() + " before proceeding");
        Object result = joinPoint.proceed();
        System.out.println("result is " + result);
        System.out.println("I finished proceeding on: " + joinPoint.getSignature().getName());
        return result;
    }
//@AfterReturning(pointcut = "execution(* Person.*(..))", returning = "result")
//public Object AroundAdvice(JoinPoint joinPoint, Object result) throws Throwable {
//    System.out.println("I'm doing something on: " + joinPoint.getSignature().getName() + " before proceeding");
//    System.out.println("result is " + result);
//    System.out.println("I finished proceeding on: " + joinPoint.getSignature().getName());
//    return result;
//}

}
