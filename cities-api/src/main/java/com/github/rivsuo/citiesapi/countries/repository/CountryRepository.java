package com.github.rivsuo.citiesapi.countries.repository;

import com.github.rivsuo.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
