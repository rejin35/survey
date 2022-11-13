package com.servey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servey.model.TravelDetail;


public interface TravelDetailsRepository extends  JpaRepository<TravelDetail, Integer>{

}