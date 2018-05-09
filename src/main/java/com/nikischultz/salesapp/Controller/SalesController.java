package com.nikischultz.salesapp.Controller;

import com.nikischultz.salesapp.domain.Sales;
import com.nikischultz.salesapp.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class SalesController {

    @Autowired
    private SalesRepository repository;

    public SalesController(SalesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/sales")
    public Collection<Sales> salesList() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

}
