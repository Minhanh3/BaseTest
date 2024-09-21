package org.example.cremanhdz.controller;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.cremanhdz.entity.dto.CustomersDto;
import org.example.cremanhdz.repository.CustomersRepositoy;
import org.example.cremanhdz.service.CustomersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("customers")
public class CustomersController {

    CustomersRepositoy customersRepositoy;
    CustomersService customersService;

    @GetMapping({"", "/"})
    public List<CustomersDto> customers() {
        return customersRepositoy.getAll();
    }

    @GetMapping("")
    public List<CustomersDto> customersa() {

        return null;
    }
}
