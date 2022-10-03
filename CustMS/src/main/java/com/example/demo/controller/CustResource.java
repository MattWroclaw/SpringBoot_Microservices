package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.Account;
import com.example.demo.bean.AccountList;
import com.example.demo.bean.Cust;
import com.example.demo.service.CustService;


@RequestMapping("/cust")
@RestController
public class CustResource {
	
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	CustService service;
	
	@GetMapping("/allCust")
	public List<Cust> getAllCust(){
		return service.getAllCust();
	}
	
	@GetMapping("/allCust/{id}")
	public Cust getIndividualCust(@PathVariable("id") int id) {
		return service.getCustById(id);
	}
	
	/*
	@GetMapping("/allAccounts")
	public AccountList getAllAccounts() {
		return restTemplate.getForObject("http://localhost:8083/acc/allAcc", AccountList.class);
	}
	*/

	private static final Logger logger = LoggerFactory.getLogger(CustResource.class);

	@GetMapping("/allAccounts")
	public Account[] getAllAccounts(){
		logger.info("Mateusz , before ");
		ResponseEntity<Account[]> response = restTemplate.getForEntity("http://localhost:8083/acc/allAcc", Account[].class);
		Account [] accounts = response.getBody();
		logger.info("Mateusz , accounts = {} ", accounts.toString());
		return accounts;

	}

	@GetMapping("/singeAcc")
	public Account getAccount() {
		return restTemplate.getForObject("http://localhost:8083/acc/allAcc/10", Account.class);
	}
}
