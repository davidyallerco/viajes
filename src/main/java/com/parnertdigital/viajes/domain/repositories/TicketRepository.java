package com.parnertdigital.viajes.domain.repositories;

import com.parnertdigital.viajes.domain.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketRepository extends CrudRepository<TicketEntity, UUID> {
}
