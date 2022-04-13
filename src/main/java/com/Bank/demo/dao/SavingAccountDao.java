package com.Bank.demo.dao;

import com.Bank.demo.pojo.Account;
import org.springframework.stereotype.Component;

@Component
public class SavingAccountDao {


    public boolean addSavingAccount(){

        System.out.println("creating Saving account .....");
        //int x= 10/0;
        return true;
    }

    public void removeSavingAccount() {

        System.out.println("removing...");
    }
    public void getSavingAccount() {

        System.out.println("getting...");
    }
    public void updateSavingAccount() {

        System.out.println("upddating...");
    }
}
