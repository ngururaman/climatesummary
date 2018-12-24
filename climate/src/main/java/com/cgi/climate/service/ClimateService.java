package com.cgi.climate.service;

import java.util.List;
import java.util.Optional;

import com.cgi.climate.model.Climate;

public interface ClimateService {
	
	public List<Climate> getClimates();
	public Optional<Climate> getClimateById(long id);
}
