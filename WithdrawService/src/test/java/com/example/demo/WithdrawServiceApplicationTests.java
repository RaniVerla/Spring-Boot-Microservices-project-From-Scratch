package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.WithdrawRepository;
import com.example.demo.model.AccountHolder_Withdraw;
import com.example.demo.service.WithdrawService;

@RunWith(SpringRunner.class)
@SpringBootTest
class WithdrawServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Autowired
	WithdrawService service;
	
	@MockBean
	WithdrawRepository repository;
	
	
	@Test
	public void addDepositTest()
	{
		AccountHolder_Withdraw acc= new AccountHolder_Withdraw();
		acc.setAccountBalance(1100.60);
		acc.setAccountNumber(120122111);
		acc.setAccountName("Yaseen Sheik");
		acc.setAccountType("Checkings");
		acc.setWithdrawAmount(400.75);
		when(repository.save(acc)).thenReturn(acc);
		assertEquals(acc, service.withdrawAmount(acc));
		
	}
}
