package com.emmasBaby.domain;

import com.emmasBaby.service.BusinessService;

public class Organization {
	private String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public BusinessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	private String slogan;
	private BusinessService businessService;

	// public Organization() { Not needed
	// }

	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public String corporateSlogan() {
		return slogan;
		//String slogan = new String("We build this city");
		//System.out.println(slogan);
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getYearOfIncorporation() {
		return yearOfIncorporation;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	public String corporateService() {
		return businessService.offerService(companyName);
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + ", slogan=" + slogan
				+ ", businessService=" + businessService + "]";
	}

}
