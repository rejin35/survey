package com.servey.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traveldetails")
public class TravelDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer travel_id;
	Integer passenger_id;
	String from_place;
	String to_place;
	String airline_name;
	Date date_of_travel;
	String departure_time;
	public Integer getTravel_id() {
		return travel_id;
	}
	public void setTravel_id(Integer travel_id) {
		this.travel_id = travel_id;
	}
	public Integer getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Integer passenger_id) {
		this.passenger_id = passenger_id;
	}
	
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public Date getDate_of_travel() {
		return date_of_travel;
	}
	public void setDate_of_travel(Date date_of_travel) {
		this.date_of_travel = date_of_travel;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getFrom_place() {
		return from_place;
	}
	public void setFrom_place(String from_place) {
		this.from_place = from_place;
	}
	public String getTo_place() {
		return to_place;
	}
	public void setTo_place(String to_place) {
		this.to_place = to_place;
	}
	
}
