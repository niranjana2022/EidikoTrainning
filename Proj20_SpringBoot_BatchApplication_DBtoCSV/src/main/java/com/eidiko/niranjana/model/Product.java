package com.eidiko.niranjana.model;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Product {

	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	
	private Double prodGst;
	private Double prodDisc;
}
//create table products(pid int,pcode varchar(20), pcost double, pdisc double,pgst double);