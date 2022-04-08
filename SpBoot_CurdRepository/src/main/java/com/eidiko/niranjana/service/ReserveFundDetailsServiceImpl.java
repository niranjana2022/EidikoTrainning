package com.eidiko.niranjana.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.entity.ReserveFundDetails;
import com.eidiko.niranjana.repo.ReserveFundDetailsRepo;

@Service
public class ReserveFundDetailsServiceImpl implements ReserveFundDetailsService {

	@Autowired
	private ReserveFundDetailsRepo repo;
	@Override
	public long countNUmberOfData() {
		System.out.println("In Memory proxy class name:"+repo.getClass()+"......."+Arrays.toString(repo.getClass().getInterfaces()));
		System.out.println("................");
		System.out.println("methods:"+Arrays.toString(repo.getClass().getDeclaredMethods()));
		
		return repo.count();
	}
//=================================existsById======================================	
	@Override
	public boolean retrieveReseatchFundDetailsDataById(Integer id) {
		return repo.existsById(id);
		
	}
//==============================findAll========================================
	@Override
	public Iterable<ReserveFundDetails> retrieveReserveFundDetailsData() {
		return  repo.findAll();
	}
//=================================findAllById=======================================
	@Override
	public Iterable<ReserveFundDetails> retrieveReserveFundDetailsDataById(Iterable<Integer> id) {
		return repo.findAllById(id);
	}
//=============================findById==================================
//	@Override
//	public ReserveFundDetails retrieveReserveFundDataById(Integer id) {
//		Optional<ReserveFundDetails>list = repo.findById(id);
//		if(list.isPresent())
//			return list.get();
//		else
//			throw new IllegalArgumentException("record not found");//if record not there then IllegalArgException message raise
//		
//	}
	
//	@Override
//	public ReserveFundDetails retrieveReserveFundDataById(Integer id) {
//		return repo.findById(id).orElseThrow(()->new IllegalArgumentException("record not found"));//if record not there then IllegalArgException message raise
//	}
	
	@Override
	public ReserveFundDetails retrieveReserveFundDataById(Integer id) {
		return repo.findById(id).orElse(new ReserveFundDetails());//if record not there then we get empty ReservefundDetails object
	}
	
//=======================save() method===================
	@Override
	public ReserveFundDetails saveReserveFundData() {
		ReserveFundDetails detail = new ReserveFundDetails();
		detail.setACCOUNT_NUMBER("111");
		detail.setCIF_NUMBER("222");
		detail.setMGMNT_COMP_ID(12);
		detail.setBUILDING_ID(33);
		detail.setRESERVE_ACCOUNT_NUMBER("44");
		detail.setIS_ACTIVE("Y");
		detail.setBRANCH_CODE("073");
		return repo.save(detail);
	}

}
