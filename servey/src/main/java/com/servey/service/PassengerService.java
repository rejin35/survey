package com.servey.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servey.model.Passenger;
import com.servey.repository.PassengerRepository;


@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepository;
	public Passenger addPassenger(Passenger passenger) {
		passengerRepository.save(passenger);
		return passenger;
	}

	public Passenger updatePassenger(Passenger passenger) {
		passengerRepository.save(passenger);
		return passenger;
	
	}
	public Optional<Passenger> getPassengerById(Integer passenger_id){
		Optional<Passenger>getid=passengerRepository.findById(passenger_id);
		return getid;
		
	}
	public Passenger deletePassenger(Passenger passenger) {
		passengerRepository.delete(passenger);
		return passenger;
	}

}
