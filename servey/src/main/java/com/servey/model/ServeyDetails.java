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
	private Integer serveyId;
	private Integer passengerId;
	private Date date;
	private String feedback;
	private String rating;
	public Integer getServeyId() {
		return serveyId;
	}
	public void setServey_id(Integer serveyId) {
		this.serveyId = serveyId;
	}
	public Integer getPassengerId() {
		return passengerId;
	}
	public void setPassenger_id(Integer passengerId) {
		this.passengerId = passengerId;
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
