package com.servey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servey.model.TravelDetail;
import com.servey.repository.TravelDetailsRepository;


@Service
public class TravelDetailsService {
	
	@Autowired
	TravelDetailsRepository travelDetailsRepository;

	public TravelDetail save(TravelDetail travelDetail) {
		travelDetailsRepository.save(travelDetail);
		return travelDetail;
		
	}
}
