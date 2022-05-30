package com.eidiko.niranjana.entity;

public class AccountDetailsEntity {

	private Integer accountId;
	private String accountHolderName;
	private String accountName;
	private String accountIfscCode;
	private String accountBranchCode;
	private String accountReferenceNo;
	private String accountOpeningDate;
	private String accountHolderContactNumber;
	private String accountHolderAddress;
	private String nomineeDetails;
	private Double accountBalance;
	private String accountNumber;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountIfscCode() {
		return accountIfscCode;
	}
	public void setAccountIfscCode(String accountIfscCode) {
		this.accountIfscCode = accountIfscCode;
	}
	public String getAccountBranchCode() {
		return accountBranchCode;
	}
	public void setAccountBranchCode(String accountBranchCode) {
		this.accountBranchCode = accountBranchCode;
	}
	public String getAccountReferenceNo() {
		return accountReferenceNo;
	}
	public void setAccountReferenceNo(String accountReferenceNo) {
		this.accountReferenceNo = accountReferenceNo;
	}
	public String getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(String accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}
	public String getAccountHolderContactNumber() {
		return accountHolderContactNumber;
	}
	public void setAccountHolderContactNumber(String accountHolderContactNumber) {
		this.accountHolderContactNumber = accountHolderContactNumber;
	}
	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}
	public void setAccountHolderAddress(String accountHolderAddress) {
		this.accountHolderAddress = accountHolderAddress;
	}
	public String getNomineeDetails() {
		return nomineeDetails;
	}
	public void setNomineeDetails(String nomineeDetails) {
		this.nomineeDetails = nomineeDetails;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "AccountDetailsEntity [accountId=" + accountId + ", accountHolderName=" + accountHolderName
				+ ", accountName=" + accountName + ", accountIfscCode=" + accountIfscCode + ", accountBranchCode="
				+ accountBranchCode + ", accountReferenceNo=" + accountReferenceNo + ", accountOpeningDate="
				+ accountOpeningDate + ", accountHolderContactNumber=" + accountHolderContactNumber
				+ ", accountHolderAddress=" + accountHolderAddress + ", nomineeDetails=" + nomineeDetails
				+ ", accountBalance=" + accountBalance + ", accountNumber=" + accountNumber + "]";
	}
	
	
}
