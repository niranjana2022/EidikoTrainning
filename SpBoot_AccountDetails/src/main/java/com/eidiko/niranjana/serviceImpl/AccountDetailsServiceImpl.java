package com.eidiko.niranjana.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.dao.AccuntDetailsDAO;
import com.eidiko.niranjana.entity.AccountDetailsEntity;
import com.eidiko.niranjana.service.AccountDetailsService;
@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {
	@Autowired
	private AccuntDetailsDAO dao;

	@Override
	public String registerAccountDetailsService(Integer accountId,String accountHolderName,String accountName,String accountIfscCode,String accountBranchCode,String accountReferenceNo,
			String accountOpeningDate,String accountHolderContactNumber,String accountHolderAddress,String nomineeDetails,Double accountBalance,String accountNumber) {
	dao.insertAccountDetailsInDB(accountId,accountHolderName,accountName,accountIfscCode,accountBranchCode,accountReferenceNo,accountOpeningDate,accountHolderContactNumber,accountHolderAddress,nomineeDetails,accountBalance,accountNumber);
		return "Data inserted Successfully";
	}

	@Override
	public List<AccountDetailsEntity> retrieveAccountDetails(Integer accountId) {
		List<AccountDetailsEntity> listed = null;
	listed = 	dao.fetchAccountDetails(accountId);
		return listed;
	}

}
