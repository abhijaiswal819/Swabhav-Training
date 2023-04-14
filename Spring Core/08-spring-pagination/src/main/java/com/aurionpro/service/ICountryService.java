package com.aurionpro.service;

import java.util.List;

import com.aurionpro.model.Country;

public interface ICountryService {

    List<Country> findPaginated(int pageNo, int pageSize);
}
