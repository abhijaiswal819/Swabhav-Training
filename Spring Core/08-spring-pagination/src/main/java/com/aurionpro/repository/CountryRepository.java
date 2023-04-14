package com.aurionpro.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.model.Country;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}
