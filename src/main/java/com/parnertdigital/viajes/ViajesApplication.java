package com.parnertdigital.viajes;

import com.parnertdigital.viajes.domain.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
@Slf4j
public class ViajesApplication implements CommandLineRunner {

	private final HotelRepository hotelRepository;

	private final FlyRepository flyRepository;

	private final TicketRepository ticketRepository;

	private final ReservationRepository reservationRepository;

	private final TourRepository tourRepository;

	private final CustomerRepository customerRepository;

	public ViajesApplication(HotelRepository hotelRepository,
							 FlyRepository flyRepository,
							 TicketRepository ticketRepository,
							 ReservationRepository reservationRepository,
							 TourRepository tourRepository,
							 CustomerRepository customerRepository) {
		this.hotelRepository = hotelRepository;
		this.flyRepository = flyRepository;
		this.ticketRepository = ticketRepository;
		this.reservationRepository = reservationRepository;
		this.tourRepository = tourRepository;
		this.customerRepository = customerRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(ViajesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var fly = flyRepository.findById(15L).get();
		var hotel = hotelRepository.findById(7L).get();
		var ticket = ticketRepository.findById(UUID.fromString("32345678-1234-5678-4234-567812345678")).get();
		var reservation = reservationRepository.findById(UUID.fromString("52345678-1234-5678-1234-567812345678")).get();
		var customer = customerRepository.findById("BBMB771012HMCRR022").get();
		log.info(String.valueOf(fly));
		log.info(String.valueOf(hotel));
		log.info(String.valueOf(ticket));
		log.info(String.valueOf(reservation));
		log.info(String.valueOf(customer));


	}
}
