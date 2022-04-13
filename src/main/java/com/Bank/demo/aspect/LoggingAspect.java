package com.Bank.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5000)
public class LoggingAspect {
    @Before("com.Bank.demo.aspect.AspectDemo.alldaoMethods()")
    public void logging1(){
        System.out.println("1======> @before all dao methods");
    }
}
