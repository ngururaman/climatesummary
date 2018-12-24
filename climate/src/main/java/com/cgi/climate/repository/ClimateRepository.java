package com.cgi.climate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.climate.model.Climate;

@Repository("climateRepository")
public interface ClimateRepository extends JpaRepository<Climate, Long>{

}
