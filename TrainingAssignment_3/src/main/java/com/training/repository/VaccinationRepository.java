package com.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.entity.VaccinationCenter;

@Repository
public interface VaccinationRepository extends JpaRepository<VaccinationCenter,Long> {

	@Query("select v from VaccinationCenter v where v.centerPincode=?1")
	List<VaccinationCenter> findByPincode(String pincode);
	
	@Query("select d from VaccinationCenter d where d.centerDistrict=?1")
	List<VaccinationCenter> findByDistrict(String district);
}
