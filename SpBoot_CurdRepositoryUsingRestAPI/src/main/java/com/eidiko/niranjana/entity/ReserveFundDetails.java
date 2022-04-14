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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer RESERVE_FUND_ID;
	
	private String ACCOUNT_NUMBER;
	
	private String CIF_NUMBER;
	private Integer MGMNT_COMP_ID;
	private Integer BUILDING_ID;
	private String RESERVE_ACCOUNT_NUMBER;
	private String IS_ACTIVE;
	private String BRANCH_CODE;
	public Integer getRESERVE_FUND_ID() {
		return RESERVE_FUND_ID;
	}
	public void setRESERVE_FUND_ID(Integer rESERVE_FUND_ID) {
		RESERVE_FUND_ID = rESERVE_FUND_ID;
	}
	public String getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}
	public void setACCOUNT_NUMBER(String aCCOUNT_NUMBER) {
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
	}
	public String getCIF_NUMBER() {
		return CIF_NUMBER;
	}
	public void setCIF_NUMBER(String cIF_NUMBER) {
		CIF_NUMBER = cIF_NUMBER;
	}
	public Integer getMGMNT_COMP_ID() {
		return MGMNT_COMP_ID;
	}
	public void setMGMNT_COMP_ID(Integer mGMNT_COMP_ID) {
		MGMNT_COMP_ID = mGMNT_COMP_ID;
	}
	public Integer getBUILDING_ID() {
		return BUILDING_ID;
	}
	public void setBUILDING_ID(Integer bUILDING_ID) {
		BUILDING_ID = bUILDING_ID;
	}
	public String getRESERVE_ACCOUNT_NUMBER() {
		return RESERVE_ACCOUNT_NUMBER;
	}
	public void setRESERVE_ACCOUNT_NUMBER(String rESERVE_ACCOUNT_NUMBER) {
		RESERVE_ACCOUNT_NUMBER = rESERVE_ACCOUNT_NUMBER;
	}
	public String getIS_ACTIVE() {
		return IS_ACTIVE;
	}
	public void setIS_ACTIVE(String iS_ACTIVE) {
		IS_ACTIVE = iS_ACTIVE;
	}
	public String getBRANCH_CODE() {
		return BRANCH_CODE;
	}
	public void setBRANCH_CODE(String bRANCH_CODE) {
		BRANCH_CODE = bRANCH_CODE;
	}
	
	

}
