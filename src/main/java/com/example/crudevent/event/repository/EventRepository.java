package com.example.crudevent.event.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.crudevent.event.entity.Event;

import jakarta.transaction.Transactional;


public interface EventRepository extends JpaRepository<Event, Long> {

	
	public static final String FIND_EVENTS = "SELECT * FROM events where isaccepted = 0 ";
	public static final String ISACCEPT = "update events set isaccepted = :val where id = :id ";

	@Query(value = FIND_EVENTS, nativeQuery = true)
	public List<Event> getAllEvents();
	
	@Transactional
	@Modifying
	@Query(value = ISACCEPT, nativeQuery = true)
	public void updateIsaccepted(@Param("id") Long id, @Param("val") Long val);
}
