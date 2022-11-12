package com.servey.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servey.model.Passenger;
import com.servey.repository.PassengerRepository;


@Service
public class Passengerservice {
	
	@Autowired
	PassengerRepository passengerRepository;
	public Passenger addpassenger(Passenger passenger) {
		passengerRepository.save(passenger);
		return passenger;
	}

	public Passenger updatepassenger(Passenger passenger) {
		passengerRepository.save(passenger);
		return passenger;
	
	}
	public Optional<Passenger> getpassengerbyid(Integer passenger_id){
		Optional<Passenger>getid=passengerRepository.findById(passenger_id);
		return getid;
		
	}
	public Passenger deletepassenger(Passenger passenger) {
		passengerRepository.delete(passenger);
		return passenger;
	}

}
