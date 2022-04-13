package com.Bank.demo.dao;

import com.Bank.demo.pojo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public String addAccount(Account acc) {
        //business logic
        System.out.println("adding...");
        return "added a new account to the database ";
    }

    public void removeAccount() {

        System.out.println("removing...");
    }
    public void getAccount() {

        System.out.println("getting...");
    }
    public void updateAccount() {

        System.out.println("upddating...");
    }
}
