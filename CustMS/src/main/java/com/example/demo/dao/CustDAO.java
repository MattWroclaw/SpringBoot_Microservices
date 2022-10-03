package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.Cust;
import java.util.*;

@Repository
public class CustDAO {
	
	List<Cust> custs = Arrays.asList(			
			new Cust(1, "ania", "develop"),
			new Cust(2, "basia", "sales"),
			new Cust(3, "czesiu", "CEO")
			);
			
			
	public List<Cust> getAllCust(){
		return custs;
	}
	
	
	public Cust getCustById(int id) {
		return custs.stream().filter(c -> c.getCustId() == id).findAny().orElse(null);
	}
	
//	List<Cust> custs = java.util.Arrays.asList(
//			new Cust("1001", "Srini", "devloper"),
//			new Cust("1002", "Max", "devloper"),
//			new Cust("1003", "Navin", "devloper"));
//		
//	
//	public List<Cust> getAllCust(){
//		return custs;
//	}
//	
//	public Cust getCustById(String id) {
//		return custs.stream().filter(cust -> id.equals(cust.getCustId())).findAny().orElse(null);
//	}

}
