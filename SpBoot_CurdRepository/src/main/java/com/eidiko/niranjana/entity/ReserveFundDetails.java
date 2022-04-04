package com.eidiko.niranjana.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="OA_RESERVE_FUND_DETAILS")
public class ReserveFundDetails {
	
	@Override
	public String toString() {
		return "ReserveFundDetails [RESERVE_FUND_ID=" + RESERVE_FUND_ID + ", ACCOUNT_NUMBER=" + ACCOUNT_NUMBER
				+ ", CIF_NUMBER=" + CIF_NUMBER + ", MGMNT_COMP_ID=" + MGMNT_COMP_ID + ", BUILDING_ID=" + BUILDING_ID
				+ ", RESERVE_ACCOUNT_NUMBER=" + RESERVE_ACCOUNT_NUMBER + ", IS_ACTIVE=" + IS_ACTIVE + ", BRANCH_CODE="
				+ BRANCH_CODE + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer RESERVE_FUND_ID;
	
	private String ACCOUNT_NUMBER;
	
	private String CIF_NUMBER;
	private Integer MGMNT_COMP_ID;
	private Integer BUILDING_ID;
	private String RESERVE_ACCOUNT_NUMBER;
	private String IS_ACTIVE;
	private String BRANCH_CODE;

}
