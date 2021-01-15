package com.tonykipchirchir.Zenith.Logistics.Controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tonykipchirchir.Zenith.Logistics.Models.Country;
import com.tonykipchirchir.Zenith.Logistics.Services.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	
	private static final Logger log = LoggerFactory.getLogger(CountryController.class);
	
	
	@GetMapping("/countries")
	public String goToCountryPage(Model model) {
		
	 List<Country>  list_of_countries =  countryService.findAllCountries();
		//this model passes the list of countries to the html page using thymeleaf.
		model.addAttribute("countries",list_of_countries );
		
		log.info( list_of_countries.toString());
	
		return "Country";
	}
	@PostMapping("/countries/addNewCountry")
	public String addNewCountry(Country country) {
		countryService.addNewCountry(country);
		//return this string so as to refresh the same page when a new country is added
		return "redirect:/countries";
	}
	
	@GetMapping("/countries/editCountry")
	@ResponseBody
	public Optional<Country> findByNationality(Integer id) 
	{
		return countryService.findById(id);
	}
	

}
