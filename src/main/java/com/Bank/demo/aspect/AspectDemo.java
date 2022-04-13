package com.Bank.demo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {
    @Pointcut("execution(* com.Bank.demo.dao.*.*(..))") //all the methods in dao package
    public void alldaoMethods() {

    }
    @Pointcut("execution(* com.Bank.demo.dao.*.get*(..))") // all get methods
    public void allGetMethods() {

    }
    @Pointcut("execution(void com.Bank.demo.dao.*.*(..))")
    public void allVoidMethods() {}
    @Pointcut("execution(* com.Bank.demo.dao.*.remove*())")
    public void allRemoveMethods() {

    }
    @Pointcut("alldaoMethods() && !(allGetMethods())") //add remove update
    public void allwithoutGet() {

    }
    
    






    //@Before("addDaoClasses()")
    //public void logbefore() {
    //    System.out.println("\n\n==========> this is from the aspect @before adding ");
    //}
    ////@Before("addDaoClasses()")
    ////public void secbefore(){
    ////    System.out.println("\n\n==========> this is from the aspect @before adding ");
    ////}
    ////@Before("addDaoClasses()")
    ////public void countOPbefore(){
    ////    System.out.println("\n\n==========> this is from the aspect @before adding ");
    ////}
//
    //@After("addDaoClasses()")
    //public void after() {
    //    System.out.println("==========> this is from the aspect @after adding ");
    //}
//
    //@AfterThrowing(
    //        value = "execution(* com.Bank.demo.dao.SavingAccountDao.add*())"
    //        , throwing = "e")
    //public void afterThrowingExFromSavingAccount(Exception e){
    //    System.out.println("\n *-/*-/*-/-*/-*/-/-/-*/-*/ Exception -*-*-*/-/*-/*-/*-/-*/-* \n "+e.getMessage());
    //}
    //@AfterReturning(
    //        value = "execution(* com.Bank.demo.dao.AccountDAO.add*(..))"
    //        , returning = "result")
    //public void afterReturning(String result){
    //    System.out.println("$$$$$$$$$$$$ "+result+"$$$$$$$$$$$$$");
    //}

}
