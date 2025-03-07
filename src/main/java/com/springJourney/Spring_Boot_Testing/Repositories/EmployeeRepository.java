package com.springJourney.Spring_Boot_Testing.Repositories;

import com.springJourney.Spring_Boot_Testing.Entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {
    List<EmployeeEntity > findByEmail(String email);

}
