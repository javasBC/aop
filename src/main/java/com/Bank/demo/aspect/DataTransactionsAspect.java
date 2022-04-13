package com.Bank.demo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(155)
public class DataTransactionsAspect {
    @Before("com.Bank.demo.aspect.AspectDemo.allVoidMethods()")
    public void updatingDb(){
        System.out.println("3======> @before void dao methods");
    }
}
