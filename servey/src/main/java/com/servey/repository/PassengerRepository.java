package com.servey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servey.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
