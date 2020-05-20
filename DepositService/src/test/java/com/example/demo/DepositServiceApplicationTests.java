package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Service.DepositService;
import com.example.demo.dao.DepositRepository;
import com.example.demo.model.AccountHolder_Deposit;

@RunWith(SpringRunner.class)
@SpringBootTest
class DepositServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	DepositService service;
	
	@MockBean
	DepositRepository repository;
	
	@Test
	public void addDepositTest()
	{
		AccountHolder_Deposit acc= new AccountHolder_Deposit();
		acc.setAccountBalance(1100.60);
		acc.setAccountNumber(120122111);
		acc.setAccountName("Yaseen Sheik");
		acc.setAccountType("Checkings");
		acc.setDepositAmount(200.00);
		when(repository.save(acc)).thenReturn(acc);
		assertEquals(acc, service.depositAmount(acc));
		
	}
	
	
	@Test
	public void getAccountHoldersTest()
	{
		
		
	}
	
	

}
