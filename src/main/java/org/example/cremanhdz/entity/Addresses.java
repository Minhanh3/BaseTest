package org.example.cremanhdz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor@AllArgsConstructor
@Data
@Table(name = "addresses")
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    @ManyToOne
    @JoinColumn(name = "customer_id" , insertable = false , updatable = false)
    private Customers customers;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "commune")
    private String commune;

    @Column(name = "district")
    private String district;

    @Column(name = "city")
    private String city;

    @Column(name = "nation")
    private String nation;

    @Column(name = "address_status")
    private String addressStatus;

}
