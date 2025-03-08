package com.springJourney.Spring_Boot_Testing.Services;

import com.springJourney.Spring_Boot_Testing.Dtos.EmployeeDTO;
import com.springJourney.Spring_Boot_Testing.Entities.EmployeeEntity;
import com.springJourney.Spring_Boot_Testing.Repositories.EmployeeRepository;
import com.springJourney.Spring_Boot_Testing.testConfigClass;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@Slf4j
@Import(testConfigClass.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ExtendWith(MockitoExtension.class)
class EmployeeServicesTest {


    @Mock
    private EmployeeRepository employeeRepository;
    @Spy
    private ModelMapper modelMapper;
    @InjectMocks
    private EmployeeServices employeeServices;

    private EmployeeEntity mockemployeeEntity;

    private EmployeeDTO mockEmployeeDto;
    @BeforeEach
    void setup(){
        mockemployeeEntity =EmployeeEntity.builder()
                .empId(1)
                .empNm("ROHAN UKE")
                .email("aron@gmail.com")
                .salary(34567)
                .build();
        mockEmployeeDto=modelMapper.map(mockemployeeEntity,EmployeeDTO.class);
    }


    @Test
    void whenGetEmpById_thenReturnEmp_otherwiseThrowException(){
        // assign
        int id=1;
        EmployeeEntity mockemployeeEntity=EmployeeEntity.builder()
                .empId(id)
                .empNm("ROHAN UKE")
                .email("aron@gmail.com")
                .salary(34567)
                .build();
        when(employeeRepository.findById(id)).thenReturn(Optional.of(mockemployeeEntity));
        // act
        log.info("Successfully Added Mock Employee with Id {}",id);
        EmployeeDTO employeeDTO=employeeServices.getEmpById(id);
        // assert
        log.info("Successfully Call Original Services methods with Mock EmployeeRepository");
        assertThat(employeeDTO.getEmpId()).isEqualTo(id);
        assertThat(employeeDTO.getEmpNm()).isEqualTo(mockemployeeEntity.getEmpNm());
        log.info("Successfully assert done we Find id : {} and name : {}",id,mockemployeeEntity.getEmpNm());
    }

    @Test
    void whenAddEmp_thenAddMockEmp() {
        // assign
        when(employeeRepository.save(any(EmployeeEntity.class))).thenReturn(mockemployeeEntity);
        // act
        EmployeeDTO employeeDTO = employeeServices.addEmp(mockEmployeeDto);

        // assert
        log.info("Asserting that the employeeDTO object is not null");
        assertThat(employeeDTO).isNotNull();

        log.info("Asserting that the employeeDTO's ID matches the mockEmployeeDto's ID");
        assertThat(employeeDTO.getEmpId()).isEqualTo(mockEmployeeDto.getEmpId());

        log.info("Asserting that the employeeDTO's email matches the mockEmployeeDto's email");
        assertThat(employeeDTO.getEmail()).isEqualTo(mockEmployeeDto.getEmail());

        // all verify methods
        log.info("Verifying that the save method was called at least once on the repository");
        verify(employeeRepository).save(any(EmployeeEntity.class));

        log.info("Verifying that the save method was called exactly once");
        verify(employeeRepository, times(1)).save(any(EmployeeEntity.class));

        log.info("Verifying that the findByEmail method was never called with a null parameter");
        verify(employeeRepository, never()).findByEmail(null);

        log.info("Verifying that the save method was called at least once");
        verify(employeeRepository, atLeastOnce()).save(any(EmployeeEntity.class));

        log.info("Verifying that the save method was called at least once (alternative syntax)");
        verify(employeeRepository, atLeast(1)).save(any(EmployeeEntity.class));

        log.info("Verifying that the save method was called at most twice");
        verify(employeeRepository, atMost(2)).save(any(EmployeeEntity.class));

        log.info("Verifying that only the save method was called on the repository");
        verify(employeeRepository, only()).save(any(EmployeeEntity.class));
    }


    @Test
    void whenAddEmp_UsingArgumentCaptor() {
        // assign
        log.info("Mocking the save method of employeeRepository to return mockemployeeEntity");
        when(employeeRepository.save(any(EmployeeEntity.class))).thenReturn(mockemployeeEntity);

        // act
        log.info("Calling addEmp method in employeeServices with mockEmployeeDto");
        EmployeeDTO employeeDTO = employeeServices.addEmp(mockEmployeeDto);

        // assert
        assertThat(employeeDTO).isNotNull();
        assertThat(employeeDTO.getEmpId()).isEqualTo(mockEmployeeDto.getEmpId());
        assertThat(employeeDTO.getEmail()).isEqualTo(mockEmployeeDto.getEmail());

        // ArgumentCaptor
        log.info("Creating an ArgumentCaptor for EmployeeEntity to capture the argument passed to the save method");
        ArgumentCaptor<EmployeeEntity> employeeEntityCaptor = ArgumentCaptor.forClass(EmployeeEntity.class);

        log.info("Verifying that the save method was called and capturing the argument passed");
        verify(employeeRepository).save(employeeEntityCaptor.capture());

        log.info("Captured argument has been verified successfully");
    }


}