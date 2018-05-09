package com.nikischultz.salesapp.repositories;

import com.nikischultz.salesapp.domain.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource
public interface SalesRepository extends JpaRepository<Sales, Integer> {
}
