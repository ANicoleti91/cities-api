package com.github.andrenicoleti.citiesapi.countries.repository;

import com.github.andrenicoleti.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
