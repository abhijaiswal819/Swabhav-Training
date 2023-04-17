package com.aurionpro.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.aurionpro.model.Country;

public interface ICountryService {

//    List<Country> findPaginated(int pageNo, int pageSize);

	Page<Country> getCountryPagination(int pageNumber, int pageSize);

	Page<Country> getCountryPaginationInSort(int pageNumber, int pageSize, String sortProperty);
}
