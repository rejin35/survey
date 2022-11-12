package com.servey.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer passenger_id;
	String passenger_firstname;
	String passenger_lastname;
	String passport_no;
	String country;
	Long phone_no;
	String email;
	public Integer getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Integer passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getPassenger_firstname() {
		return passenger_firstname;
	}
	public void setPassenger_firstname(String passenger_firstname) {
		this.passenger_firstname = passenger_firstname;
	}
	public String getPassenger_lastname() {
		return passenger_lastname;
	}
	public void setPassenger_lastname(String passenger_lastname) {
		this.passenger_lastname = passenger_lastname;
	}
	public String getPassport_no() {
		return passport_no;
	}
	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
