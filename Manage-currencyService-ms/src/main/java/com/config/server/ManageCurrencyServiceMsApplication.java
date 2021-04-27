package com.config.server;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


import com.config.server.DTO.CurrencyDto;
import com.config.server.repo.CurrencyRepository;


@SpringBootApplication
@EnableDiscoveryClient

public class ManageCurrencyServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageCurrencyServiceMsApplication.class, args);
	}
	
	@Autowired
	CurrencyRepository repo;
	
	@PostConstruct
	public void inserDate() {
		
		repo.save(new CurrencyDto(1,"USD-INR",Double.valueOf(75)));
		repo.save(new CurrencyDto(2,"EURO-INR",Double.valueOf(89.87)));
		repo.save(new CurrencyDto(3,"YEN-INR",Double.valueOf(0.69)));
		repo.save(new CurrencyDto(4,"DINAR-INR",Double.valueOf(105.98)));
		repo.save(new CurrencyDto(5,"CNY-INR",Double.valueOf(11.49)));
		
		
		
		repo.save(new CurrencyDto(6,"INR-USD",Double.valueOf(0.0134)));
		repo.save(new CurrencyDto(7,"INR-EURO",Double.valueOf(0.0111)));
		repo.save(new CurrencyDto(8,"INR-YEN",Double.valueOf(1.4444)));
		repo.save(new CurrencyDto(9,"INR-DINAR",Double.valueOf(0.0040)));
		repo.save(new CurrencyDto(10,"INR-CNY",Double.valueOf(0.087)));
		
		

		
	}


		
	

}
