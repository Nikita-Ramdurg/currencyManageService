package com.config.server.Controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.server.DTO.CurrencyDto;
import com.config.server.Service.CurrencyService;

//import lombok.extern.slf4j.Slf4j;

//import lombok.extern.slf4j.Slf4j;

@RestController

//@RequestMapping(name="/Currency-conversion")
public class CurrencyController {
	
	@Autowired
	CurrencyService currencyService;
	
	@GetMapping("/countries")
	public List<CurrencyDto> getCountries() {
		return currencyService.getCountries();
	}
	
	
	@GetMapping("/Currency-conversion/{CountryCode}")
	public ResponseEntity<CurrencyDto> getConversionFactor(@PathVariable ("CountryCode") String CountryCode){
		
		CurrencyDto dto= currencyService.getConversionFactor(CountryCode);
		if(dto!=null) {
			return new  ResponseEntity<CurrencyDto>(dto,HttpStatus.FOUND);
			
		}else
		return  new  ResponseEntity<CurrencyDto>(dto,HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping("/addcurrency")
	public ResponseEntity<CurrencyDto> addConversionFactor(@RequestBody CurrencyDto newCurrency){
		CurrencyDto addCurrency=currencyService.addConversionFactor(newCurrency);
		if(Objects.nonNull(addCurrency)) {
			return ResponseEntity.accepted().build();
		}
		return new ResponseEntity<CurrencyDto>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/updatecurrency")
	public ResponseEntity<CurrencyDto> updateConversionFactor(@RequestBody CurrencyDto updateCurrency){
		CurrencyDto updatecurrency=currencyService.updateConversionFactor(updateCurrency);
		System.out.println(updatecurrency);
		if(Objects.nonNull(updatecurrency)) {
			return ResponseEntity.accepted().build();
		}
		return new ResponseEntity<CurrencyDto>(HttpStatus.NOT_FOUND);
	}
	
	}

