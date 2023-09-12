package com.parnertdigital.viajes.domain.repositories;

import com.parnertdigital.viajes.domain.entities.TourEntity;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<TourEntity, Long> {
}
