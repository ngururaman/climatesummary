package com.cgi.climate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.climate.model.Climate;
import com.cgi.climate.repository.ClimateRepository;

@Service("climateService")
public class ClimateServiceImpl implements ClimateService {

	@Autowired
	private ClimateRepository climateRepository;

	@Override
	public List<Climate> getClimates() {
		return climateRepository.findAll();
	}

	@Override
	public Optional<Climate> getClimateById(long id) {
		return climateRepository.findById(id);
	}
}
