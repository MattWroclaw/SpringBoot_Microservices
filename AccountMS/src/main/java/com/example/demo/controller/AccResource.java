package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Account;
import com.example.demo.service.AccService;
@RequestMapping("/acc")
@RestController
public class AccResource {
	
	@Autowired
	AccService service;
	
	@GetMapping("/allAcc")
	public List<Account> getAccounts(){
		return service.getAccounts();
	}
	
	@GetMapping("/allAcc/{id}")
	public Account accById(@PathVariable("id") int id) {
		return service.getAccountWithId(id);
	}

}
