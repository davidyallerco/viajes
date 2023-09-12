package com.parnertdigital.viajes.domain.repositories;

import com.parnertdigital.viajes.domain.entities.CustomerEntity;
import com.parnertdigital.viajes.domain.entities.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ReservationRepository extends CrudRepository<ReservationEntity, UUID> {

}
