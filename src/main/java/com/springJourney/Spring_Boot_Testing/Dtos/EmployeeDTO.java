package com.springJourney.Spring_Boot_Testing.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {


    private Integer empId;

    private String empNm;

   private String email;

    private float salary;


}
