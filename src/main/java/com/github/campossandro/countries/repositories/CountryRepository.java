package com.github.campossandro.countries.repositories;

import com.github.campossandro.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
