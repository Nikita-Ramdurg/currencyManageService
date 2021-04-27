package com.config.server.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.config.server.DTO.CurrencyDto;
import com.config.server.repo.CurrencyRepository;

@Service
public class CurrencyService {



	@Autowired
	CurrencyRepository repo; 

	public CurrencyDto getConversionFactor(String countryCode) {
		List<CurrencyDto> currency=repo.findByCountryCode(countryCode);
		if(currency!=null) {
			return currency.get(0);
		}
		return null;
	}

	public CurrencyDto addConversionFactor(CurrencyDto newCurrency) {
		return repo.save(newCurrency);
	}

	public CurrencyDto updateConversionFactor(CurrencyDto updateCurrency) {
		CurrencyDto update=getConversionFactor(updateCurrency.getCountryCode());
		if(update!=null) {
			updateCurrency.setId(update.getId());
			return repo.save(updateCurrency);
		}
		return null;
	}

	public List<CurrencyDto> getCountries() {
		
		return repo.findAll();
	}

	
	

}
