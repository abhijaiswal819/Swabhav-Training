package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.model.Country;
import com.aurionpro.service.ICountryService;

@RestController
public class MyController {

    @Autowired
    private ICountryService countryService;

    @GetMapping("/countries/{pageNo}/{pageSize}")
    public List<Country> getPaginatedCountries(@PathVariable int pageNo, 
            @PathVariable int pageSize) {

        return countryService.findPaginated(pageNo, pageSize);
    }
}