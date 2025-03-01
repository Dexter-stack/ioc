package com.dexter.ioc.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity   // to interact with our jpa
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // to create primary key
    private Long departmentId;

    @NotNull(message = "Name cannot be null")
    @Length(max = 6, min=4)
//    @Length(max = 5, min = 1)
//    @Size(max = 10, min = 0)
//    @Email
//    @Positive
//    @Future
//    @FutureOrPresent
    //validations annotations
    private String departmentName;
    @NotNull(message = "Address should not be blank")
    private String departmentAddress;
    private String departmentCode;


}
