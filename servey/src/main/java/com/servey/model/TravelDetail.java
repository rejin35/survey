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
	private Integer travelId;
	private Integer passengerId;
	private String fromPlace;
	private String toPlace;
	private String airlineName;
	private Date dateOfTravel;
	private String departure_time;
	public Integer getTravelId() {
		return travelId;
	}
	public void setTravelId(Integer travelId) {
		this.travelId = travelId;
	}
	public Integer getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public Date getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	
}
