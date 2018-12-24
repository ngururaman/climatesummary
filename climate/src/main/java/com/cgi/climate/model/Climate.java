package com.cgi.climate.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum Province {
	BC, AB, QC, MB, NT, NU, SK, YT, ON, NB, NS, PE, NL
}

@Entity
public class Climate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String stationName;

	@Enumerated(EnumType.STRING)
	private Province province;
	private Date date;
	private BigDecimal meanTemp;
	private BigDecimal highestMonthlyMaxiTemp;
	private BigDecimal LowestMonthlyMinTemp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Number getMeanTemp() {
		return meanTemp;
	}

	public BigDecimal getHighestMonthlyMaxiTemp() {
		return highestMonthlyMaxiTemp;
	}

	public void setHighestMonthlyMaxiTemp(BigDecimal highestMonthlyMaxiTemp) {
		this.highestMonthlyMaxiTemp = highestMonthlyMaxiTemp;
	}

	public BigDecimal getLowestMonthlyMinTemp() {
		return LowestMonthlyMinTemp;
	}

	public void setLowestMonthlyMinTemp(BigDecimal lowestMonthlyMinTemp) {
		LowestMonthlyMinTemp = lowestMonthlyMinTemp;
	}

	public void setMeanTemp(BigDecimal meanTemp) {
		this.meanTemp = meanTemp;
	}
}
