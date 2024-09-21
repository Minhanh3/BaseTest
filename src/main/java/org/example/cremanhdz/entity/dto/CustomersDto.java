package org.example.cremanhdz.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomersDto {
    private Long id;

    private String customerCode;

    private String fullName;

    private String email;

    private LocalDate createDate;

    private String avata;

    private Integer customerStatus;

    private String passcode;

    private LocalDate crateDate;

    private String phoneNumber;
}
