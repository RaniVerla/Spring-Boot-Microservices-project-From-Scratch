package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AccountHolder;

@Repository
public interface AccountRepository extends JpaRepository<AccountHolder, Integer>{
	
	

}
