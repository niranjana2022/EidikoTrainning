package com.eidiko.niranjana.enity;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private  String location;
	private String client;
	private String hq;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getHq() {
		return hq;
	}
	public void setHq(String hq) {
		this.hq = hq;
	}
	
	
}
