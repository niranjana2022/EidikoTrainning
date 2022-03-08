package com.nt.bo;

public class PdfBOClass {

	private String firstWeek;
	private String firstMoth;
	private String secondMonth;
	private String thirdMonth;
	private String sixMonth;
	private String nineMonth;
	private String firstYear;
	
	public PdfBOClass() {
	}
	public String getFirstWeek() {
		return firstWeek;
	}
	public void setFirstWeek(String firstWeek) {
		this.firstWeek = firstWeek;
	}
	public String getFirstMoth() {
		return firstMoth;
	}
	public void setFirstMoth(String firstMoth) {
		this.firstMoth = firstMoth;
	}
	public String getSecondMonth() {
		return secondMonth;
	}
	public void setSecondMonth(String secondMonth) {
		this.secondMonth = secondMonth;
	}
	public String getThirdMonth() {
		return thirdMonth;
	}
	public void setThirdMonth(String thirdMonth) {
		this.thirdMonth = thirdMonth;
	}
	public String getSixMonth() {
		return sixMonth;
	}
	public void setSixMonth(String sixMonth) {
		this.sixMonth = sixMonth;
	}
	public String getNineMonth() {
		return nineMonth;
	}
	public void setNineMonth(String nineMonth) {
		this.nineMonth = nineMonth;
	}
	public String getFirstYear() {
		return firstYear;
	}
	public void setFirstYear(String firstYear) {
		this.firstYear = firstYear;
	}
	@Override
	public String toString() {
		return "PdfBOClass [firstWeek=" + firstWeek + ", firstMoth=" + firstMoth + ", secondMonth=" + secondMonth
				+ ", thirdMonth=" + thirdMonth + ", sixMonth=" + sixMonth + ", nineMonth=" + nineMonth + ", firstYear="
				+ firstYear + "]";
	}
	
	
}
