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
@Table(name="tbl_shd_transfer_account_balance")
public class AccountHolder_Transfer {
	
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
	private double transferAmount;
	@Column
	private String transferTo;
	@JsonFormat(pattern="MM/dd/yyyy'T'HH:mm:ss")
	@Column
	private LocalDateTime  transferTime;
	

	public AccountHolder_Transfer(){}


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


	public double getTransferAmount() {
		return transferAmount;
	}


	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}


	public String getTransferredTo() {
		return transferTo;
	}


	public void setTransferredTo(String transferTo) {
		this.transferTo = transferTo;
	}


	public LocalDateTime getTransferTime() {
		return transferTime;
	}


	public void setTransferTime(LocalDateTime transferTime) {
		this.transferTime = transferTime;
	}


	@Override
	public String toString() {
		return "AccountHolder_Transfer [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", accountType=" + accountType + ", accountBalance=" + accountBalance
				+ ", previousBalance=" + previousBalance + ", transferAmount=" + transferAmount + ", transferredTo="
				+ transferTo + ", transferTime=" + transferTime + "]";
	}
	
	
	

}
