package com.eidiko.niranjana.entity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my.app")
public class Employee {

	//@Value("${my.app.eId}")
	private Integer eId;
	//@Value("${my.app.eName}")
	private String eName;
	//@Value("${my.app.eAddrs}")
	private String eAddrs;
	
	//String type
	//@Value("${my.app.empFavColor}")
	private String[] empFavColor;
	
	//List type
	//@Value("${my.app.empFavFood}")
	private List<String> empFavFood;
	
	//Map type
	//@Value("${my.app.empFavCars}")
	private Map<String,String> empFavCars;

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddrs() {
		return eAddrs;
	}

	public void seteAddrs(String eAddrs) {
		this.eAddrs = eAddrs;
	}

	public String[] getEmpFavColor() {
		return empFavColor;
	}

	public void setEmpFavColor(String[] empFavColor) {
		this.empFavColor = empFavColor;
	}

	public List<String> getEmpFavFood() {
		return empFavFood;
	}

	public void setEmpFavFood(List<String> empFavFood) {
		this.empFavFood = empFavFood;
	}

	public Map<String, String> getEmpFavCars() {
		return empFavCars;
	}

	public void setEmpFavCars(Map<String, String> empFavCars) {
		this.empFavCars = empFavCars;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddrs=" + eAddrs + ", empFavColor="
				+ Arrays.toString(empFavColor) + ", empFavFood=" + empFavFood + ", empFavCars=" + empFavCars + "]";
	}

	
	
}
