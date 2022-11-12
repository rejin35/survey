package com.servey.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.servey.model.Passenger;

@SpringBootTest
class PassengerRepositoryTest {

	@Autowired
	private PassengerRepository passengerRepository;
	
	@Test
	void isPassengerExistsById() {
//		Passenger passenger = new Passenger();		
//		passenger.setPassengerFirstname("test");
//		passenger.setCountry("India");
//		passenger.setPassportNo("test");	
//		passenger.setPhoneNo(1234l);		
		
//		Passenger newPassenger = passengerRepository.save(passenger);
		Optional<Passenger> pass = passengerRepository.findById(3);
		assertEquals("test", pass.get().getPassengerFirstname());		
	}
}
