package com.example.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountList {

	private List<Account> accList ;

	public List<Account> getAccList() {
		return accList;
	}

	public void setAccList(List<Account> accList) {
		this.accList = accList;
	}

	public AccountList() {
		this.accList = new ArrayList<>();
	}
}
