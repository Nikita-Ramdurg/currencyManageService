package com.config.server.repo;

import java.util.List;
import java.util.Optional;

//import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.config.server.DTO.CurrencyDto;
//import com.config.server.DTO.CurrencyDto;



public interface CurrencyRepository extends JpaRepository<CurrencyDto,Long> {

public	List<CurrencyDto> findByCountryCode(String countryCode);

//public void update(CurrencyDto updateCurrency);

	

	
}
