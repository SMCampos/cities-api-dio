package com.github.campossandro.staties.repositories;

import com.github.campossandro.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
