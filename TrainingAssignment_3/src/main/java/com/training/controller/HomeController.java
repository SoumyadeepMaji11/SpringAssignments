package com.training.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.VaccinationCenter;
import com.training.repository.VaccinationRepository;
import com.training.service.VaccinationService;

@RestController
public class HomeController {

	@Autowired
	VaccinationService vaccinationService;
	
	@Autowired
	VaccinationRepository vaccinationRepository;
	
	
	@RequestMapping("/")
	public ModelAndView homepage() {
		return new ModelAndView("home");
	}
	
	//Adding elements in the database by Postman
	@RequestMapping(value= "/addcenters",method = RequestMethod.POST)
	public void newEmployee(@RequestBody VaccinationCenter vaccinationCenter) {
		vaccinationRepository.save(vaccinationCenter);
	}
	
	//Showing all the Vaccination Center
	@RequestMapping(value="api/v1/all", method=RequestMethod.GET)
	 public ModelAndView viewpatient(){ 
		ModelAndView m = new ModelAndView();
        List<VaccinationCenter> list=vaccinationService.getAll(); 
        System.out.print(list);
        m.addObject("list",list);
        m.setViewName("allCenters");
        return m;
	}
	
	//Opening Search by district page
	@RequestMapping(value="api/v1/dist")
	public ModelAndView searchByDist() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("districtSearch");
		return mv;
	}
	
	//Search By district
	@PostMapping("/district/dis")
	public ModelAndView districtList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("allCenters");
		String district = request.getParameter("district");
		List<VaccinationCenter> list = vaccinationService.getAllCenterByDistrict(district);
		mav.addObject("list",list);
		return mav;
	}
	
	//Opening Search by pincode page
	@RequestMapping(value="api/v1/pin")
	public ModelAndView searchByPin() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("pinSearch");
		return mv;
	}
	
	//Search by Pincode
	@PostMapping("/pincode/pin")
	public ModelAndView pincodeList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("allCenters");
		String pincode = request.getParameter("pincode");
		List<VaccinationCenter> list = vaccinationService.getAllCenterByPincode(pincode);
		mav.addObject("list",list);
		return mav;
	
	}
	
}
