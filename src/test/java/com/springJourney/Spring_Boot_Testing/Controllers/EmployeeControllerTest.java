package com.springJourney.Spring_Boot_Testing.Controllers;

import com.springJourney.Spring_Boot_Testing.Dtos.EmployeeDTO;
import com.springJourney.Spring_Boot_Testing.Entities.EmployeeEntity;
import com.springJourney.Spring_Boot_Testing.Repositories.EmployeeRepository;
import com.springJourney.Spring_Boot_Testing.testConfigClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;
@AutoConfigureWebTestClient(timeout = "100000")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(testConfigClass.class)
class EmployeeControllerTest {


    @Autowired
    private WebTestClient webTestClient;

    @Autowired
    private EmployeeRepository employeeRepository;

    private EmployeeEntity testEmployee;

    private EmployeeDTO testEmployeeDto;
    @BeforeEach
    void setUp_AddEmp(){
        testEmployee=EmployeeEntity.builder()
                .empNm("ROHAN UKE")
                .email("aron@gmail.com")
                .salary(34567)
                .build();
        testEmployeeDto=EmployeeDTO.builder()
                .empNm("ROHAN UKE")
                .email("aron@gmail.com")
                .salary(34567)
                .build();
    }

    @Test
    void getEmpById_Test_success(){
        // Save the entity and get the assigned ID
        EmployeeEntity savedEmployee = employeeRepository.save(testEmployee);

        // Now update the DTO with the actual ID from the saved entity
        testEmployeeDto.setEmpId(savedEmployee.getEmpId());

        webTestClient.get()
                .uri("/employees/{id}", savedEmployee.getEmpId())
                .exchange()
                .expectStatus().isOk()
                .expectBody(EmployeeDTO.class)
                .isEqualTo(testEmployeeDto);
    }
    @Test
    void getEmpById_Test_failed(){
        webTestClient.get()
                .uri("/employees/1")
                .exchange()
                .expectStatus().isNotFound();

    }

    @AfterEach
    void cleanUp() {
        employeeRepository.deleteAll();
    }

}