package com.servey.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servey.model.ServeyDetails;
import com.servey.repository.ServeyDetailsRepository;

@Service
public class ServeyDetailsService {

	@Autowired
	ServeyDetailsRepository serveyDetailsRepository;

	public  ServeyDetails save(ServeyDetails serveyDetails) {
		return serveyDetailsRepository.save(serveyDetails);
	}

	public ServeyDetails update(ServeyDetails serveyDetails) {
		serveyDetailsRepository.save(serveyDetails);
		return serveyDetails;
		
	}

	public ServeyDetails deletedetailsbyid(ServeyDetails serveyDetails) {
		serveyDetailsRepository.delete(serveyDetails);
		return serveyDetails;
		
	}

	public Optional<ServeyDetails> getdetailsbyid(Integer passenger_id) {
		Optional<ServeyDetails>getid=serveyDetailsRepository.findById(passenger_id);
		return getid;
	}
	
	
	
	
}
