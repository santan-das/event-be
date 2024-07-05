package com.example.crudevent.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudevent.event.entity.Event;
import com.example.crudevent.event.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	
	public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
	
	public List<Event> getAllEvents() {
        return eventRepository.getAllEvents();
    }
	
    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }
    
    public Event updateEvent(Long id, Event event) {
        event.setId(id);
        return eventRepository.save(event);
    }
    
    public void updateAccept(Long id, Long val) {
          eventRepository.updateIsaccepted(id, val);
    }
    
    
    public void deleteEvent(Long id) {
    	eventRepository.deleteById(id);
    }
    


	
	

}
