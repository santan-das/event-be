package com.example.crudevent.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudevent.event.dto.EmployeeDto;
import com.example.crudevent.event.entity.Event;
import com.example.crudevent.event.service.EmployeeServiceImpl;
import com.example.crudevent.event.service.EventService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EventController {	

	@Autowired
	private EventService eventService;

	@PostMapping(value = "/event")
	public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }
	
	
	@GetMapping(value = "/events")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
	
	@PutMapping("/event/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }
	
	@PutMapping("/isaccept/{id}/{val}")
    public ResponseEntity<String> updateIsaccepted(@PathVariable Long id, @PathVariable Long val) {
		try {
			eventService.updateAccept(id, val);
			return ResponseEntity.ok("Field updated successfully.");
		}catch (Exception e) {
			return ResponseEntity.status(500).body("An error occurred while updating the field.");
			
		}
         
		
    }
	
	
	 @DeleteMapping("/{id}")
	    public void deleteEvent(@PathVariable Long id) {
		 eventService.deleteEvent(id);
	    }
	
	
}
