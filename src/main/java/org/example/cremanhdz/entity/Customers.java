package org.example.cremanhdz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "customer_code")
    private String customerCode;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "avata")
    private String avata;

    @Column(name = "customer_status")
    private Integer customerStatus;

    @Column(name = "passcode")
    private String passcode;

    @Column(name = "crate_date")
    private LocalDate crateDate;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "customers")
    private List<Addresses> addresses;
}
