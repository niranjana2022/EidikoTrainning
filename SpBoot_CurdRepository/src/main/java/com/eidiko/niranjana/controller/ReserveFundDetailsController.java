package com.eidiko.niranjana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.ReserveFundDetails;
import com.eidiko.niranjana.service.ReserveFundDetailsService;

@RestController
public class ReserveFundDetailsController {
	
	@Autowired
	private ReserveFundDetailsService service;
	
	@GetMapping("/count")
	public long reserveFundDataCount()
	{
		return service.countNUmberOfData();
	}
//	@GetMapping("/fetch")
//	public Iterable<ReserveFundDetails> reserveFundDataFetching()
//	{
//		Iterable<ReserveFundDetails>list= service.retrieveReserveFundDetailsData();
//		for(ReserveFundDetails lists : list)
//		{
//			System.out.println(lists);
//			//return lists;
//			
//		}
//		return list;
//	}

}
