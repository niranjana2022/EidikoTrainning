package com.eidiko.niranjana.service;

import java.util.List;

import com.eidiko.niranjana.entity.AccountDetailsEntity;

public interface AccountDetailsService {

	public String registerAccountDetailsService(Integer accountId,String accountHolderName,String accountName,String accountIfscCode,String accountBranchCode,String accountReferenceNo,
			String accountOpeningDate,String accountHolderContactNumber,String accountHolderAddress,String nomineeDetails,Double accountBalance,String accountNumber);
	
	
	public List<AccountDetailsEntity> retrieveAccountDetails(Integer accountId);
}
