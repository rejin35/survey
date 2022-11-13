package com.servey.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servey.model.TravelDetail;
import com.servey.service.TravelDetailsService;


@RestController
@ComponentScan("com.*")
@RequestMapping("/")
public class TravelDetailController {

	@Autowired
	TravelDetailsService travelDetailsService;
	
	@PostMapping("/addtraveldetails")
	public TravelDetail addtraveldetails(@RequestBody TravelDetail travelDetail) {
		travelDetailsService.save(travelDetail);
		return travelDetail;
		
	}
}
