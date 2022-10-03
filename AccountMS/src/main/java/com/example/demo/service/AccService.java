package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Account;
import com.example.demo.dao.AccDAO;

@Service
public class AccService {

	@Autowired
	AccDAO dao;
	
	public List<Account> getAccounts () {
		return dao.getAllAccounts();
	}
	
	public Account getAccountWithId(int id) {
		return dao.getAccountById(id);
	}
}
