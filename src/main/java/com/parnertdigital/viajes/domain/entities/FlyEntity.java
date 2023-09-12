package com.parnertdigital.viajes.domain.entities;

import com.parnertdigital.viajes.util.AeroLine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "fly")
public class FlyEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double originLat;
    private Double originLng;
    private Double destinyLat;
    private Double destinyLng;
    @Column(length = 20)
    private String originName;
    @Column(length = 20)
    private String destinyName;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private AeroLine aeroLine;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER,  orphanRemoval = true,  mappedBy = "fly" )
    private Set<TicketEntity> tickets;
}