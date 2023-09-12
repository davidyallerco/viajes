package com.parnertdigital.viajes.domain.repositories;

import com.parnertdigital.viajes.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //aunque no es necesario , spring lo pone por defecto
public interface FlyRepository extends JpaRepository<FlyEntity,Long> {
}
