package com.Bank.demo;

import com.Bank.demo.dao.AccountDAO;
import com.Bank.demo.dao.SavingAccountDao;
import com.Bank.demo.pojo.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		var context =SpringApplication.run(BankApplication.class, args);

		var accountdao=context.getBean(AccountDAO.class);
		var svaingAccountdao=context.getBean(SavingAccountDao.class);

		accountdao.addAccount(new Account(31,"dima",700_000_001));


		accountdao.removeAccount();

	}

}
