package com.Bank.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(100000)
public class SecAspect {
    @Before("com.Bank.demo.aspect.AspectDemo.allGetMethods()")
    public void sec(){
        System.out.println("2======+> @before all get methods");
    }
}
