package com.servey.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.anything;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.servey.model.Passenger;
import com.servey.repository.PassengerRepository;

@ExtendWith(MockitoExtension.class)
class PassengerServiceTest {

	@Mock
	private PassengerRepository passengerRepository;

	@InjectMocks
	private PassengerService passengerService;
	
	@Test
	void testGetPassengerById() {
		
		Passenger outputPassenger = new Passenger();
		outputPassenger.setPassengerId(1);
		outputPassenger.setPassengerFirstname("test");
		outputPassenger.setCountry("India");
		outputPassenger.setPassportNo("test");	
		outputPassenger.setPhoneNo(1234l);
				
		Optional<Passenger> returnCacheValue = Optional.of((Passenger) outputPassenger);
		
		when(passengerRepository.findById(1)).thenReturn(returnCacheValue);
		Optional<Passenger> passenger = passengerService.getPassengerById(1);		
		assertEquals("test", passenger.get().getPassengerFirstname());
	}
}
