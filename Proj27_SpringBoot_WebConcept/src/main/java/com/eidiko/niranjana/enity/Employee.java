package com.eidiko.niranjana.enity;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Integer eid;
	private String ename;
	private String edesg;
	private String[]  favFood;
//	private Set<Long> phoneNumbers;
	private Long phoneNumbers;
	private Map<String,Object> idDetails;
	//use here company entity (HAS-A property)
	private Company company;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public String[] getFavFood() {
		return favFood;
	}
	public void setFavFood(String[] favFood) {
		this.favFood = favFood;
	}

	public Long getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Long phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Map<String, Object> getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	/*
	public Employee(Integer eid, String ename, String edesg, String[] favFood, Set<Long> phoneNumbers,
			Map<String, Object> idDetails, Company company) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesg = edesg;
		this.favFood = favFood;
		this.phoneNumbers = phoneNumbers;
		this.idDetails = idDetails;
		this.company = company;
	}
	
	*/
}
