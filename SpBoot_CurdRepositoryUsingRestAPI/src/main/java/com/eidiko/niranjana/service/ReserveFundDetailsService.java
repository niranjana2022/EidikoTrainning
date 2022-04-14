package com.eidiko.niranjana.service;

import com.eidiko.niranjana.entity.ReserveFundDetails;

public interface ReserveFundDetailsService {
	//count method
	
	public long countNUmberOfData();
	
	//existById
	public boolean retrieveReseatchFundDetailsDataById(Integer id);
	
	//findAll() method
	public Iterable<ReserveFundDetails> retrieveReserveFundDetailsData();
	
	
	//findAllById(Iterable<ID> id)
	public Iterable<ReserveFundDetails> retrieveReserveFundDetailsDataById(Iterable<Integer> id);
	
	//findById(ID id)
	public ReserveFundDetails retrieveReserveFundDataById(Integer id);
	
	//save() method
	//public ReserveFundDetails saveResearchFundData();
	

}
