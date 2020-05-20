package com.example.demo.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountRepository;
import com.example.demo.model.AccountHolder;

@Service
public class AccountService {

	@Autowired
	AccountRepository repository;

	@Transactional
	public AccountHolder saveAccounts(AccountHolder accounts) throws ParseException {
		double price=accounts.getAccountBalance();
		accounts.setAccountBalance(price);
		repository.save(accounts);
		return accounts;

	}

	public List<AccountHolder> getAllAccounts() {
		return repository.findAll();
	}

	public Optional<AccountHolder> getaccountById(int accountId) {

		 Optional<AccountHolder> accbyId=repository.findById(accountId);
		 
		 return  accbyId;
	}
	
	



}


//AccountHolder account1 = new AccountHolder(1, 12012234, "Jayesh Narayan", "06/03/2000", "Savings",
//"12/03/2010 12:00:00", 0.00, 1223344523, "San Jose");
//
//AccountHolder account2 = new AccountHolder(1, 12012235, "Khyati kirbandi", "06/03/2000", "Savings",
//"12/03/2010 12:00:00", 0.00, 1344567889, "San Jose");
//
//AccountHolder account3 = new AccountHolder(1, 12012235, "Jason Statham", "06/03/2000", "Savings",
//"12/03/2010 12:00:00", 0.00, 1345466789, "San Jose");

//List<AccountHolder> accountholders=Arrays.asList(account1,account2,account3);

//public List<AccountHolder> getAllAccounts()
//{
//List<AccountHolder> accountholderlist=accountholders.stream().collect(Collectors.toList());
//
//return accountholderlist;
//}
