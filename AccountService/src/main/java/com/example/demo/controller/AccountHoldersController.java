package com.example.demo.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.AccountService;
import com.example.demo.model.AccountHolder;

@RestController
@RequestMapping("/account-service")
public class AccountHoldersController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	private RestTemplate template;


	//get the account Holders
	@GetMapping("/getallaccounts")
	public List<AccountHolder> accountholder()
	{
		List<AccountHolder> list=accountService.getAllAccounts();
		return list;
	}
	
	//create accountholders by postmethod	
	@PostMapping("/add/accountees")
	public AccountHolder addAccountees(@RequestBody AccountHolder accounts) throws ParseException
	{
		//repository.save(accounts);
		return accountService.saveAccounts(accounts);
		 
	}
	
	//get account details basing on id
	@GetMapping("/getaccountbyid/{accountid}")
	public Optional<AccountHolder> getaccountById(@PathVariable("accountid") int accountId )
	{
		Optional<AccountHolder> getaccbyId=accountService.getaccountById(accountId);
		return getaccbyId;
	}
	
	
	@GetMapping("/getfromdepositservice")
	public AccountHolder depositthroughDepositService(@PathVariable int accountid)
	{
		
		String url="http://DEPOSIT-SERVICE/getaccountbyid/"+accountid;
		
		return template.getForObject(url, AccountHolder.class);
	}
	
	

}
