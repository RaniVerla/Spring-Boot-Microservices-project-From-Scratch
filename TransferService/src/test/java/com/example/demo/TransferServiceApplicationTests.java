package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.TransferRepository;
import com.example.demo.model.AccountHolder_Transfer;
import com.example.demo.service.TransferService;


@RunWith(SpringRunner.class)
@SpringBootTest
class TransferServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Autowired
	TransferService service;
	
	@MockBean
	TransferRepository repository;
	
	@Test
	public void addDepositTest()
	{
		AccountHolder_Transfer acc= new AccountHolder_Transfer();
		acc.setAccountBalance(1100.60);
		acc.setAccountNumber(120122111);
		acc.setAccountName("Yaseen Sheik");
		acc.setAccountType("Checkings");
		acc.setTransferAmount(400.75);
		when(repository.save(acc)).thenReturn(acc);
		assertEquals(acc, service.accounttransfer(acc));
		
	}

}
