package com.servey.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "serveydetails")
public class ServeyDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer servey_id;
	Integer passenger_id;
	Date date;
	String feedback;
	String rating;
	public Integer getServey_id() {
		return servey_id;
	}
	public void setServey_id(Integer servey_id) {
		this.servey_id = servey_id;
	}
	public Integer getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Integer passenger_id) {
		this.passenger_id = passenger_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	

}
