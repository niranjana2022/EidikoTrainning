package com.eidiko.niranjana.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eidiko.niranjana.dao.AccuntDetailsDAO;
import com.eidiko.niranjana.entity.AccountDetailsEntity;
@Repository
public class AccountDetailsImpl implements AccuntDetailsDAO{
	@Autowired
	private JdbcTemplate template;
	@Override
	public String insertAccountDetailsInDB(Integer accountId, String accountHolderName, String accountName,
			String accountIfscCode, String accountBranchCode, String accountReferenceNo, String accountOpeningDate,
			String accountHolderContactNumber, String accountHolderAddress, String nomineeDetails, Double accountBalance,
			String accountNumber) {
		String Query = "insert into ACCOUNT_DETAILS(ACCOUNT_ID,ACCOUNT_HOLDER_NAME,ACCOUNT_NAME,ACCOUNT_IFSC_CODE,ACCOUNT_BRANCH_CODE,ACCOUNT_REFERENCE_NO,ACCOUNT_OPENING_DATE,ACCOUNT_HOLDER_CONTACT_NUMBER,ACCOUNT_HOLDER_ADDRESS,NOMINEE_DETAILS,ACCOUNT_BALANCE,ACCOUNT_NUMBER)"
				+ "VALUES(ACCOUNT_ID.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?)";
		
		template.update(Query,accountHolderName,accountName,accountIfscCode,accountBranchCode,accountReferenceNo,accountOpeningDate,accountHolderContactNumber,accountHolderAddress,nomineeDetails,accountBalance,accountNumber);
		 return "ok";
	}
	@Override
	public List<AccountDetailsEntity> fetchAccountDetails(Integer accountId) {
		String SelectQuery ="select ACCOUNT_ID, ACCOUNT_HOLDER_NAME,ACCOUNT_NAME,ACCOUNT_IFSC_CODE,ACCOUNT_BRANCH_CODE,ACCOUNT_REFERENCE_NO,ACCOUNT_OPENING_DATE,ACCOUNT_HOLDER_CONTACT_NUMBER,ACCOUNT_HOLDER_ADDRESS,NOMINEE_DETAILS,ACCOUNT_BALANCE,ACCOUNT_NUMBER from ACCOUNT_DETAILS where ACCOUNT_ID=?";
		List<AccountDetailsEntity> list =null;
		Object[] args = {accountId};
		list = template.query(SelectQuery,args,BeanPropertyRowMapper.newInstance(AccountDetailsEntity.class));
		return list;
	}

}
