package com.example.eventmanagement.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Event {
	@Id
	private Long id; 
	private String title ;
	private String description; 
	private String eventType; 
	private boolean musicSystem; 
	private String foodType; 
	private double price;
	private Timestamp date ;
	private Timestamp backdrop;
	public Event(Long id, String title, String description, String eventType, boolean musicSystem, String foodType,
			double price, Timestamp date, Timestamp backdrop) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.eventType = eventType;
		this.musicSystem = musicSystem;
		this.foodType = foodType;
		this.price = price;
		this.date = date;
		this.backdrop = backdrop;
	}
	public Event() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public boolean isMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(boolean musicSystem) {
		this.musicSystem = musicSystem;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public Timestamp getBackdrop() {
		return backdrop;
	}
	public void setBackdrop(Timestamp backdrop) {
		this.backdrop = backdrop;
	}
	
}
