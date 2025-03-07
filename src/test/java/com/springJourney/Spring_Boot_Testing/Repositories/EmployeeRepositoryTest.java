package com.springJourney.Spring_Boot_Testing.Repositories;

import com.springJourney.Spring_Boot_Testing.Entities.EmployeeEntity;
import com.springJourney.Spring_Boot_Testing.testConfigClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Import(testConfigClass.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    private EmployeeEntity employee;

    @BeforeEach
    void setup(){
       employee =EmployeeEntity.builder()
               .empNm("big Doe")
               .email("big@gmail.com")
               .salary(345699)
               .build();
        employeeRepository.saveAndFlush(employee);
    }
    @Test
    void findByEmail_whenEmailIsValid_thenReturnEmployee() {
        // Given
        // emp data
        // When
        List<EmployeeEntity> employeeList = employeeRepository
                .findByEmail(employee.getEmail());
        // Then
        assertThat(employeeList).isNotNull();
        assertThat(employeeList.getFirst().getEmail())
                .isEqualTo(employee.getEmail());
        System.out.println(employee.getEmail());
        System.out.println(employee.getEmpNm());
        System.out.println(employee.getSalary());
    }


//    @Test
//    void findByEmail_whenEmailIsNotValid_thenReturnEmptyList(){
//
//    }
}