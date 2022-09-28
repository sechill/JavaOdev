package oop1;

public class CorporateCustomer extends Customer{
	private String companyName;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTextNumber() {
		return textNumber;
	}
	public void setTextNumber(String textNumber) {
		this.textNumber = textNumber;
	}
	private String textNumber;

}
