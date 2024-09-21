package org.example.cremanhdz.repository;

import org.example.cremanhdz.entity.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressesRepositoy extends JpaRepository<Addresses, Long> {
}
