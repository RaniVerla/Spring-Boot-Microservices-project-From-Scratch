package com.example.demo.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tbl_shd_account_holder")
public class AccountHolder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer accountId;
	@Column
	private Integer accountNumber;
	@Column
	private String accountName;
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern="MM/dd/yyyy")
	@Column
	private LocalDate dateOfBirth;
	@Column
	private String accountType;
	@JsonFormat(pattern="MM/dd/yyyy'T'HH:mm:ss")
	@Column
	private LocalDateTime  accountStartDate;
	@Column(columnDefinition="Decimal(10,2) default '100.00'")
	private double accountBalance;
	@Column
	private Long mobileNumber;
	@Column
	private String address;
	@Transient
	private double depositamount;
	
	
	
	public AccountHolder() {
	}



	public Integer getAccountId() {
		return accountId;
	}



	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}



	public Integer getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public LocalDateTime getAccountStartDate() {
		return accountStartDate;
	}



	public void setAccountStartDate(LocalDateTime accountStartDate) {
		this.accountStartDate = accountStartDate;
	}



	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	public Long getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getDepositamount() {
		return depositamount;
	}



	public void setDepositamount(double depositamount) {
		this.depositamount = depositamount;
	}



	@Override
	public String toString() {
		return "AccountHolder [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", dateOfBirth=" + dateOfBirth + ", accountType=" + accountType + ", accountStartDate="
				+ accountStartDate + ", accountBalance=" + accountBalance + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + ", depositamount=" + depositamount + "]";
	}



	

}
