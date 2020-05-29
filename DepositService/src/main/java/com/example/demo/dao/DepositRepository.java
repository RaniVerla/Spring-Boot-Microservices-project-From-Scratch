package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AccountHolder_Deposit;

public interface DepositRepository extends JpaRepository<AccountHolder_Deposit, Integer> {

	Optional<AccountHolder_Deposit> findByAccountNumber(int accountnumber);

}
