package org.example.cremanhdz.service;

import org.example.cremanhdz.entity.Customers;
import org.example.cremanhdz.repository.CustomersRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {

    @Autowired
    private CustomersRepositoy customersRepo;

    public List<Customers> ListPage(Pageable pageable) {
        return customersRepo.findAll(pageable).getContent();
    }
}
