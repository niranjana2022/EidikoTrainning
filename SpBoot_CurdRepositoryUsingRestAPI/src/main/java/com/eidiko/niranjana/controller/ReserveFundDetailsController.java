package com.eidiko.niranjana.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		System.out.println("..........Count Method.............");
		return service.countNUmberOfData();
	}
	//===============================================================================		
	
	@GetMapping("/checkDataById")
	public String checkingreserveFundDataById()
	{
		System.out.println(".........exisyById method..............");
		System.out.println(service.retrieveReseatchFundDetailsDataById(8));
		return "data retrieved using specific Id";
	}
	
	@GetMapping("/fetchAllData")
	public Iterable<ReserveFundDetails> reserveFundDataFetching()
	{
		System.out.println(".........findAll method..............");
		Iterable<ReserveFundDetails>list= service.retrieveReserveFundDetailsData();
		System.out.println("all data are:"+list);
		for(ReserveFundDetails lists : list)
		{
			System.out.println(lists.getACCOUNT_NUMBER());
		}
		return list;
	}
	//===============================================================================
	@GetMapping("/fetchAllDataById")
	public Iterable<ReserveFundDetails> reserveFundDataFetchingById()
	{
		System.out.println("------findAllById method--------");
		List<Integer> list = new ArrayList();
		list.add(7);
		list.add(71);
		Iterable<ReserveFundDetails>listDetail= service.retrieveReserveFundDetailsDataById(list);
		System.out.println("all data are:"+listDetail);
		for(ReserveFundDetails lists : listDetail)
		{
			System.out.println(lists.getACCOUNT_NUMBER());
		}
		return listDetail;
	}
	//===============================================================================
	@GetMapping("/fetchSpecificDataById")
	public ReserveFundDetails reserveFundSpecificDataFetchingById()
	{
		System.out.println("------findById method--------");
		ReserveFundDetails details = service.retrieveReserveFundDataById(71);
		System.out.println(details);
		return details;
	}
//	@PostMapping("/fetchSpecificDataById1")
//	public ReserveFundDetails reserveFundSpecificDataFetchingById1(@RequestBody ReserveFundDetails reserve)
//	{
//		System.out.println("------findById method--------");
//		ReserveFundDetails details = service.retrieveReserveFundDataById(reserve.getRESERVE_FUND_ID());
//		System.out.println(details);
//		return details;
//	}
	
}
