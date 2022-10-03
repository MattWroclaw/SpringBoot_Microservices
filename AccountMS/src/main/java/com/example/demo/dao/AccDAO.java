package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.Account;

@Repository
public class AccDAO {
	
	List<Account> accs = Arrays.asList(
			new Account(10, "A1", "A2"),
			new Account(20, "b1", "b2"),
			new Account(30, "c1", "c2"),
			new Account(40, "d1", "d2"),
			new Account(50, "e1", "e2")
			
			);
	
	public List<Account> getAllAccounts(){
		return accs;
	}
	
	public Account getAccountById(int id) {
		return accs.stream().filter(ac -> ac.getAccId() == id).findAny().orElse(null);
	}

}
