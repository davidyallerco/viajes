package com.parnertdigital.viajes.domain.repositories;

import com.parnertdigital.viajes.domain.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity,String> {
}
