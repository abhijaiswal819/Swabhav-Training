package com.aurionpro.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

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

//	@Override
//	public List<Country> findPaginated(int pageNo, int pageSize) {
//
////       Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("name"));
////        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("population").descending());
//
//		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("id").ascending().and(Sort.by("name")));
//
//		Page<Country> pagedResult = repository.findAll(paging);
//
//		return pagedResult.toList();
//	}
	
	@Override
	public Page<Country> getCountryPagination(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		
		return repository.findAll(pageable);	
	}

	@Override
	public Page<Country> getCountryPaginationInSort(int pageNumber, int pageSize, String sortProperty) {
		Pageable pageable = null;
		if(null!=sortProperty) {
			pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC, sortProperty);
		}
		else {
		 pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC, "name");
		}
		return repository.findAll(pageable);	
	}
}
