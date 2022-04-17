package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.entity.VaccinationCenter;
import com.training.repository.VaccinationRepository;

@Service
public class VaccinationService {

	@Autowired
	VaccinationRepository vaccinationRepository;
	
	public List<VaccinationCenter> getAll(){
		return (List<VaccinationCenter>)vaccinationRepository.findAll();
	}
	
	public List<VaccinationCenter> getAllCenterByPincode(String pincode) {
		return vaccinationRepository.findByPincode(pincode);
	}
	
	public List<VaccinationCenter> getAllCenterByDistrict(String district){
		return vaccinationRepository.findByDistrict(district);
	}
}
