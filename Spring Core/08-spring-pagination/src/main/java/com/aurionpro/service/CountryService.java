package com.aurionpro.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.aurionpro.model.Country;
import com.aurionpro.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findPaginated(int pageNo, int pageSize) {

        PageRequest paging = PageRequest.of(pageNo, pageSize);
        Page<Country> pagedResult = repository.findAll(paging);

        return pagedResult.toList();
    }
}
