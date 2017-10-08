package com.emmasBaby.serviceImpl;

import java.util.Random;

import com.emmasBaby.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	@Override
	public String offerService(String companyName) {
		Random ran = new Random();
		String service = "\nAs an Organisation, "+ companyName + ". My random number is :"+ran.toString() +" This is the eCommerce Impl";
		
		return service;
	}

}
