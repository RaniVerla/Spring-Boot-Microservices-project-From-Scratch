package com.example.demo.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.AccountHolder;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/account-service")
public class AccountHoldersController {
	
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	private RestTemplate template;


	//get the account Holders
	@GetMapping("/getallaccounts")
	public List<AccountHolder> getallaccountholders()
	{
		
		String url="http://ACCOUNT-SERVICE/account-service/getallaccounts";
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
	@GetMapping("/getaccountbyid/{accoutnumber}")
	public AccountHolder getaccountById(@PathVariable("accountid") int accountId )
	{
		Optional<AccountHolder> getaccbyId=accountService.getaccountById(accountId);
	
		
		return getaccbyId.orElseThrow(()->handleException());
		
	}
	
	
	@GetMapping("/getfromdepositservice/{accountnumber}")
	public double depositthroughDepositService(@PathVariable int accountnumber)
	{
		
		String url="http://DEPOSIT-SERVICE/deposit-service/getaccountbynumber/" +accountnumber;
		
		return template.getForObject(url, double.class);
	}
	
	
	@ExceptionHandler({MyResourceNotFoundException.class})
	public MyResourceNotFoundException handleException()
	{
		return new MyResourceNotFoundException("Requested Id is not found");
	}
	
	
	//get balance and date using 3 services
	
	//amount deposit service
	
	//with draw service
	
	//transfer service
	
	//test to check 
	

}
