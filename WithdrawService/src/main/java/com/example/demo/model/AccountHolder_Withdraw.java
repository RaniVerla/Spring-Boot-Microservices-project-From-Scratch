package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tbl_shd_withdraw_account_balance")
public class AccountHolder_Withdraw {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int accountId;
	@Column
	private int accountNumber;
	@Column
	private String accountName;
	@Column
	private String accountType;
	@Column
	private double accountBalance;
	@Column
	private double previousBalance;
	@Column
	private double withdrawAmount;
	@JsonFormat(pattern="MM/dd/yyyy'T'HH:mm:ss")
	@Column
	private LocalDateTime  withdrawTime;
	
	public AccountHolder_Withdraw(){}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getPreviousBalance() {
		return previousBalance;
	}

	public void setPreviousBalance(double previousBalance) {
		this.previousBalance = previousBalance;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public LocalDateTime getWithdrawTime() {
		return withdrawTime;
	}

	public void setWithdrawTime(LocalDateTime withdrawTime) {
		this.withdrawTime = withdrawTime;
	}

	@Override
	public String toString() {
		return "AccountHolder_Withdraw [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", accountType=" + accountType + ", accountBalance=" + accountBalance
				+ ", previousBalance=" + previousBalance + ", withdrawAmount=" + withdrawAmount + ", withdrawTime="
				+ withdrawTime + "]";
	}
	
	
	

}
