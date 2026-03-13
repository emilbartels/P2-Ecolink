package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.enums.ConditionEcopoint;
import com.example.demo.model.Ecopoint;
import com.example.demo.model.GPSLocations;
import com.example.demo.model.enums.StatusEcopoint;

@RestController
public class EcopointController {

	@GetMapping("/api/test")
	public Ecopoint EcopointTest() {
		GPSLocations location = new GPSLocations(-45.0, 33.0);
		Ecopoint ep = new Ecopoint("UNB Ecopoint1", location, StatusEcopoint.NOTFULL, ConditionEcopoint.WORKS);
		return ep;
	}

}
