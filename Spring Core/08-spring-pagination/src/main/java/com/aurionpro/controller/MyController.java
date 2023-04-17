package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.model.Country;
import com.aurionpro.service.ICountryService;

@RestController
@RequestMapping("countryapp")
public class MyController {

    @Autowired
    private ICountryService countryService;

//    @GetMapping("/countries/{pageNo}/{pageSize}")
//    public List<Country> getPaginatedCountries(@PathVariable int pageNo, 
//            @PathVariable int pageSize) {
//
//        return countryService.findPaginated(pageNo, pageSize);
//    }
    
    @RequestMapping(value ="/countries/{pageNumber}/{pageSize}", method= RequestMethod.GET)
	public Page<Country> studentPagination(@PathVariable int pageNumber, @PathVariable int pageSize){
		return countryService.getCountryPagination(pageNumber,pageSize);
	}
	
	@RequestMapping(value ="/countries/{pageNumber}/{pageSize}/{sortProperty}", method= RequestMethod.GET)
	public Page<Country> studentPagination(@PathVariable int pageNumber, @PathVariable int pageSize, @PathVariable String sortProperty){
		return countryService.getCountryPaginationInSort(pageNumber,pageSize,sortProperty);
	}
}