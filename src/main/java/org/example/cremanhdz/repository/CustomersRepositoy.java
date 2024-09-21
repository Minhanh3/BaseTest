package org.example.cremanhdz.repository;

import org.example.cremanhdz.entity.Customers;
import org.example.cremanhdz.entity.dto.CustomersDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepositoy extends JpaRepository<Customers, Long> {

    @Query("""
    SELECT new org.example.cremanhdz.entity.dto.CustomersDto(CUS.id , CUS.customerCode , CUS.fullName ,
    CUS.email , CUS.createDate ,CUS.avata , CUS.customerStatus , CUS.passcode ,CUS.crateDate , CUS.phoneNumber)
    FROM Customers CUS
""")
    List<CustomersDto> getAll();

}
