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

import com.servey.model.ServeyDetails;
import com.servey.service.ServeyDetailsService;

@RestController
@ComponentScan("com.*")
@RequestMapping("/")
public class ServeyController {
	
	@Autowired
	ServeyDetailsService serveyDetailsService;
	
	@PostMapping("/addserveydetails")
	public ServeyDetails adddetails(@RequestBody ServeyDetails serveyDetails) {
		serveyDetailsService.save(serveyDetails);
		return serveyDetails;	
	}
	
	@PutMapping("/updateserveydetails")
	public ServeyDetails updateDetails(@RequestBody ServeyDetails serveyDetails) {
		serveyDetailsService.update(serveyDetails);
		return serveyDetails;
	}
	@GetMapping("/getdetailsbyid")
	public Optional<ServeyDetails> getDetailsById(@RequestParam Integer passenger_id ) {
		Optional<ServeyDetails>getid=serveyDetailsService.getdetailsbyid(passenger_id);
		
		return getid;		
	}
	@DeleteMapping("/deletedetailsbyid")
	public ServeyDetails deleteDetailsById(@RequestBody ServeyDetails serveyDetails) {
		serveyDetailsService.deletedetailsbyid(serveyDetails);
		return serveyDetails;		
	}
	
	
}
