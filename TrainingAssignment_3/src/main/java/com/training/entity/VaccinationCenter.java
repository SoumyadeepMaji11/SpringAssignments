package com.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccinationcenter")
public class VaccinationCenter {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String centerName;
	private String centerPincode;
	private String centerDistrict;
	private long availableVaccines;
	
	
	
	public VaccinationCenter() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public VaccinationCenter(long id, String centerName, String centerPincode, String centerDistrict,
			long availableVaccines) {
		super();
		this.id = id;
		this.centerName = centerName;
		this.centerPincode = centerPincode;
		this.centerDistrict = centerDistrict;
		this.availableVaccines = availableVaccines;
	}

	public VaccinationCenter(String centerName, String centerPincode, String centerDistrict, long availableVaccines) {
		super();
		this.centerName = centerName;
		this.centerPincode = centerPincode;
		this.centerDistrict = centerDistrict;
		this.availableVaccines = availableVaccines;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterPincode() {
		return centerPincode;
	}

	public void setCenterPincode(String centerPincode) {
		this.centerPincode = centerPincode;
	}

	public String getCenterDistrict() {
		return centerDistrict;
	}

	public void setCenterDistrict(String centerDistrict) {
		this.centerDistrict = centerDistrict;
	}

	public long getAvailableVaccines() {
		return availableVaccines;
	}

	public void setAvailableVaccines(long availableVaccines) {
		this.availableVaccines = availableVaccines;
	}

	@Override
	public String toString() {
		return "VaccinationCenter [id=" + id + ", centerName=" + centerName + ", centerPincode=" + centerPincode
				+ ", centerDistrict=" + centerDistrict + ", availableVaccines=" + availableVaccines + "]";
	}
	
	
	
}
