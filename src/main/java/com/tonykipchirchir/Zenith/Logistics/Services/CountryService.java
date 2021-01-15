package com.tonykipchirchir.Zenith.Logistics.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonykipchirchir.Zenith.Logistics.Models.Country;
import com.tonykipchirchir.Zenith.Logistics.Repositories.CountryRepository;


@Service
public class CountryService {
	
    @Autowired
    private CountryRepository countryRepository ;
    
    
    
    public List<Country>  findAllCountries()
    {
    	return countryRepository.findAll();
    }
    
    
    
    public void addNewCountry(Country country) {
    	countryRepository.save(country);
    }
    
    public Optional<Country> findById(Integer  id) 
    {
    	return countryRepository.findById(id);
    }
	
}
