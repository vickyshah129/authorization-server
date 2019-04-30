package com.authorization.server.repository;

import com.authorization.server.domain.RandomCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomCityRepository extends JpaRepository<RandomCity, Long> {
}
