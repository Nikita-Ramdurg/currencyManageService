package com.config.server.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Currency_conversion")
public class CurrencyDto {
	 @Id
	private long id;
	
     @Column(name="country_code")
	private String countryCode;
	
     @Column(name="conversionFactor")
	private double conversionFactor;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public double getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	
	
	
	@Override
	public String toString() {
		return "CurrencyDto [id=" + id + ", countryCode=" + countryCode + ", conversionFactor=" + conversionFactor
				+ "]";
	}

	public CurrencyDto(int id, String countryCode, double conversionFactor) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
	}

	public CurrencyDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
