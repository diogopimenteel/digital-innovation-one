package com.github.rivsuo.citiesapi.states.repositories;

import com.github.rivsuo.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
