package com.eidiko.niranjana.controler;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.AccountDetailsEntity;
import com.eidiko.niranjana.service.AccountDetailsService;

@RestController
public class AccountDetailsController {
	@Autowired
	private AccountDetailsService service;
	
	@PostMapping("/insert_data")
	public String insertAccountDetailsEntityDataIntoDB(@RequestBody AccountDetailsEntity entity){
		return  service.registerAccountDetailsService(entity.getAccountId(),entity.getAccountHolderName(),entity.getAccountName(),entity.getAccountIfscCode(),
				entity.getAccountBranchCode(),entity.getAccountReferenceNo(),entity.getAccountOpeningDate(),entity.getAccountHolderContactNumber(),entity.getAccountHolderAddress(),
				entity.getNomineeDetails(),entity.getAccountBalance(),entity.getAccountNumber());
		
	}
	
	@GetMapping("/get")
	public List<AccountDetailsEntity> fetchAllDetails(@RequestBody AccountDetailsEntity accountId) throws ParseException
	{
		List<AccountDetailsEntity> response = null;
		response = service.retrieveAccountDetails(accountId.getAccountId());
		AccountDetailsEntity entityBo = new AccountDetailsEntity();
		entityBo.setAccountId(18);
		entityBo.setAccountName("Canara Bank");
		entityBo.setAccountHolderAddress("hyderabad");
		entityBo.setAccountHolderContactNumber("9494844");
		entityBo.setAccountHolderName("Niranjana");
		entityBo.setAccountIfscCode("8984489894");
		entityBo.setAccountBalance(29993.0);
		entityBo.setAccountNumber("821928929");
		entityBo.setAccountBranchCode("099");
		entityBo.setAccountReferenceNo("737378328737");
		entityBo.setAccountOpeningDate("2022-05-23");
		entityBo.setNomineeDetails("kajol");
		entityBo.getAccountId();
		entityBo.getAccountHolderName();
		entityBo.getAccountName();
		entityBo.getAccountIfscCode();
		entityBo.getAccountBranchCode();
		entityBo.getAccountReferenceNo();
		entityBo.getAccountOpeningDate();
		entityBo.getAccountHolderContactNumber();
		entityBo.getAccountHolderAddress();
		entityBo.getNomineeDetails();
		entityBo.getAccountBranchCode();
		entityBo.getAccountBalance();
		System.out.println(entityBo);
		System.out.println(response);		
		
		String str = entityBo.getAccountOpeningDate();
		System.out.println("string Date value: "+str);

		Date date=Date.valueOf(str);//converting string into sql date.
		System.out.println(date);
		
		//converting String to util
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//System.out.println("simple date format"+sdf); //it is an object
		java.util.Date utilDate = sdf.parse(str);
		System.out.println("UtilDate value: "+utilDate);
		return response;
	}
}
