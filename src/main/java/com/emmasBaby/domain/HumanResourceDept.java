package com.emmasBaby.domain;

import com.emmasBaby.service.RecruitmentService;

public class HumanResourceDept implements Department {
	private String departmentName;
	private RecruitmentService recruitmentService;
	private Organization org;

	public HumanResourceDept(RecruitmentService recruitmentService, Organization org) {
		this.recruitmentService = recruitmentService;
		this.org = org;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(org.getCompanyName(), departmentName, numberOfRecruitments);
		return hiringFacts;
	}

}
