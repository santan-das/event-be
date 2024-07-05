package com.example.crudevent.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

	

	public Event(Long id, String organizename, String eventname, String location, String typeofevent, String eventdate, String cost, String description, Integer isaccepted) {
		super();
		this.id = id;
		this.organizename = organizename;
		this.eventname = eventname;
		this.location = location;
		this.typeofevent = typeofevent;
		this.eventdate = eventdate;
		this.cost = cost;
		this.description = description;
		this.isaccepted = isaccepted;
	}

	public Event() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "organizename")
	private String organizename;

	@Column(name = "eventname")
	private String eventname;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "typeofevent")
	private String typeofevent;
	
	@Column(name = "cost")
	private String cost;
	
	@Column(name = "eventdate")
	private String eventdate;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "isaccepted", columnDefinition = "int default 0")
	private Integer isaccepted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganizename() {
		return organizename;
	}

	public void setOrganizename(String organizename) {
		this.organizename = organizename;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getTypeofevent() {
		return typeofevent;
	}

	public void setTypeofevent(String typeofevent) {
		this.typeofevent = typeofevent;
	}
	
	public String getEventdate() {
		return eventdate;
	}

	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getIsaccepted() {
		return isaccepted;
	}

	public void setIsaccepted(Integer isaccepted) {
		this.isaccepted = isaccepted;
	}
	
	
}
