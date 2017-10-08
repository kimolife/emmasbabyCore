package com.emmasBaby.serviceImpl;

import java.util.Random;

import com.emmasBaby.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	@Override
	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random rand = new Random();
		String result = "Hiring Agency - Company: " + companyName + " , Department: " + departmentName
				+ " with this amount of recruiments :" + rand.nextInt(numberOfRecruitments);
		return result;
	}

}
