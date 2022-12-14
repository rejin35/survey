package com.servey.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.servey.model.Passenger;
import com.servey.service.PassengerService;


@RestController
@ComponentScan("com.*")
@RequestMapping("/")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;

	@PostMapping("/addpassenger")
	Passenger addpassenger (@RequestBody Passenger passenger ) {
		passengerService.addPassenger(passenger);
		return passenger;	
	}
	@PutMapping("/updatepassenger")
	Passenger updatepassenger (@RequestBody Passenger passenger ) {
		passengerService.updatePassenger(passenger);
		return passenger;
		
	}
	@GetMapping("/getbyid")
	Optional<Passenger> getpassengerbyid (@RequestParam Integer passenger_id) {
		Optional<Passenger>getid=passengerService.getPassengerById(passenger_id);
		return getid;
		
	}
	@DeleteMapping("/deletepassenger")
	Passenger deletepassenger (@RequestBody Passenger Passenger) {
		passengerService.deletePassenger(Passenger);
		return Passenger;
		
	}
	
}
