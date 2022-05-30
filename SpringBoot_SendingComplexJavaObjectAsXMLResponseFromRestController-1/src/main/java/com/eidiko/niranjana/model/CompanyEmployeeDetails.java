package com.eidiko.niranjana.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyEmployeeDetails {

	private Integer id;
	private String name;
	private String addrs;
	private String designation;
	private Double salary;
	private String dob;
	private String accountNumber;
	private String joinningDate;
	private String[] favFoods;
	private List<String> favColors;
	private Set<Long> phoneNumbers;
	private Map<String,Object> idDetails;
	
	//HAS property
	private EmployeePrevBgDetails company;
	
}
