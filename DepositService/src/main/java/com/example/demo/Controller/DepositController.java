package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DepositService;
import com.example.demo.dao.DepositRepository;
import com.example.demo.model.AccountHolder_Deposit;

@RestController
@RequestMapping("/deposit-service")
public class DepositController {

	@Autowired
	DepositService service;

	@Autowired
	DepositRepository repository;

	// post Method to deposit some amount
	@PostMapping("/depositamount")
	public AccountHolder_Deposit depositAmount(@RequestBody AccountHolder_Deposit accdeposit) {

		AccountHolder_Deposit accountdeposit = service.depositAmount(accdeposit);

		return accountdeposit;

	}

	// get the account Holders
	@GetMapping("/getallaccounts")
	public List<AccountHolder_Deposit> accountholder() {
		return repository.findAll();
	}

	// get account details basing on id
	@GetMapping("/getaccountbyid/{accountid}")
	public Optional<AccountHolder_Deposit> getaccountById(@PathVariable("accountid") int accountId) {
		// Optional<AccountHolder> getaccbyId=accountService.getaccountById(accountId);
		return repository.findById(accountId);
	}

}
