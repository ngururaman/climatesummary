package com.cgi.climate.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.climate.model.Climate;
import com.cgi.climate.service.ClimateService;

@RestController
public class ClimateRestController {
	private static final Logger logger = LoggerFactory.getLogger(ClimateRestController.class);
	
	@Autowired
	private ClimateService climateService;
	
	@RequestMapping(path="/climates", method=RequestMethod.GET)
	public List<Climate> getClimates(){
		logger.info("ClimateRestController : getClimates() called");
		return climateService.getClimates();
	}
    @RequestMapping(value = "/climate/{id}", method = RequestMethod.GET)
	public Optional<Climate> getClimateById(@PathVariable("id") long id){
    	logger.info("ClimateRestController : getClimateById() called");
    	System.out.println("Id value "+id);
		return climateService.getClimateById(id);
	}
}
