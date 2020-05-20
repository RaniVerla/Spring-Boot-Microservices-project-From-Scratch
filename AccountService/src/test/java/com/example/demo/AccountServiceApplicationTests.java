package com.example.demo;


import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Service.AccountService;
import com.example.demo.dao.AccountRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
class AccountServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private AccountService service;
	
	@MockBean
	private AccountRepository repository;
	
	
	@Test
	public void saveAccountsTest() throws ParseException
	{
//		 String sDate1="31/12/1998";  
//	     Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
//		AccountHolder acc1=new AccountHolder(12012234,"Jayesh Narayan","Savings",0.0,1234567890,"San Jose");
//		//AccountHolder acc=new AccountHolder();
//		when(repository.save(acc1)).thenReturn(acc1);
//		assertEquals(acc1, service.saveAccounts(acc1));
		
	}

}
