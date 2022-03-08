package com.nt.bo;

public class Pdf {

	private String Recommended_Grid_AED;
	private String One_Week;
	private String One_Month;
	private String Two_Month;
	private String Three_Month;
	private String Six_Month;
	private String Nine_Month;
	private String One_Year;
	public String getRecommended_Grid_AED() {
		return Recommended_Grid_AED;
	}
	public void setRecommended_Grid_AED(String recommended_Grid_AED) {
		Recommended_Grid_AED = recommended_Grid_AED;
	}
	public String getOne_Week() {
		return One_Week;
	}
	public void setOne_Week(String one_Week) {
		One_Week = one_Week;
	}
	public String getOne_Month() {
		return One_Month;
	}
	public void setOne_Month(String one_Month) {
		One_Month = one_Month;
	}
	public String getTwo_Month() {
		return Two_Month;
	}
	public void setTwo_Month(String two_Month) {
		Two_Month = two_Month;
	}
	public String getThree_Month() {
		return Three_Month;
	}
	public void setThree_Month(String three_Month) {
		Three_Month = three_Month;
	}
	public String getSix_Month() {
		return Six_Month;
	}
	public void setSix_Month(String six_Month) {
		Six_Month = six_Month;
	}
	public String getNine_Month() {
		return Nine_Month;
	}
	public void setNine_Month(String nine_Month) {
		Nine_Month = nine_Month;
	}
	public String getOne_Year() {
		return One_Year;
	}
	public void setOne_Year(String one_Year) {
		One_Year = one_Year;
	}
	public Pdf(String recommended_Grid_AED, String one_Week, String one_Month, String two_Month, String three_Month,
			String six_Month, String nine_Month, String one_Year) {
		super();
		Recommended_Grid_AED = recommended_Grid_AED;
		One_Week = one_Week;
		One_Month = one_Month;
		Two_Month = two_Month;
		Three_Month = three_Month;
		Six_Month = six_Month;
		Nine_Month = nine_Month;
		One_Year = one_Year;
	}
	
	
}
