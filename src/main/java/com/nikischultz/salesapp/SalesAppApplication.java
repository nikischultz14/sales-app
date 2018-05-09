package com.nikischultz.salesapp;

import com.nikischultz.salesapp.domain.Sales;
import com.nikischultz.salesapp.repositories.SalesRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.nikischultz.salesapp.repositories")
public class SalesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalesAppApplication.class, args);
    }


@Bean
ApplicationRunner init(SalesRepository repository) {
    return args -> {
        Stream.of("Cut", "Color", "Wax", "Facial").forEach(salesType -> {
            Sales sales = new Sales();
            sales.setSalesType(salesType);
            repository.save(sales);
        });
    repository.findAll().forEach(System.out::println);
};
}
}