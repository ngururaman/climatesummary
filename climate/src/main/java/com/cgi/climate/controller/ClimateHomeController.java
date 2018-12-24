package com.cgi.climate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClimateHomeController {
	private static final Logger logger = LoggerFactory.getLogger(ClimateHomeController.class);
	   
	@RequestMapping("climate")
	public ModelAndView climate() {
		logger.info("ClimateHomeController : climate() called");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("climate");
		return mv;
	}

	@RequestMapping("climateDetails")
	public ModelAndView climateDetails(@RequestParam("id") int id) {
		logger.info("ClimateHomeController : climateDetails() called with value "+id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.setViewName("climatedetails");
		return mv;
	}
}
