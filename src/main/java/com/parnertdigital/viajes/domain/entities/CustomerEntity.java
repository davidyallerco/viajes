package com.parnertdigital.viajes.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "customer")
public class CustomerEntity implements Serializable {

    @Id
    private String dni;
    @Column(length = 50)
    private String fullName;
    @Column(length = 20)
    private String creditCard;
    @Column(length = 12)
    private String phoneNumber;
    private Integer totalFlights;
    private Integer totalLodgings;
    private Integer totalTours;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true,  mappedBy = "customer"  )
    private Set<TicketEntity> tickets;


    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER,  orphanRemoval = true, mappedBy = "customer"  )
    private Set<ReservationEntity> reservations;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true,  mappedBy = "customer"  )
    private Set<TourEntity> tours;


}