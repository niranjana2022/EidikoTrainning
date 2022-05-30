package com.eidiko.niranjana.dao;


import java.util.List;

import com.eidiko.niranjana.entity.AccountDetailsEntity;

public interface AccuntDetailsDAO {

	public String insertAccountDetailsInDB(Integer accountId,String accountHolderName,String accountName,String accountIfscCode,String accountBranchCode,String accountReferenceNo,
			String accountOpeningDate,String accountHolderContactNumber,String accountHolderAddress,String nomineeDetails,Double accountBalance,String accountNumber);
	
	public List<AccountDetailsEntity> fetchAccountDetails(Integer accountId);
}
