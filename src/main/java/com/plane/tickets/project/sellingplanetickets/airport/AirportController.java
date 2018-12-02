package com.plane.tickets.project.sellingplanetickets.airport;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AirportController {
    @Autowired
    private AirportService airportService;


    @RequestMapping("/airports")
    public List<Airport> getAllPlanes() {
        return airportService.getAllAirports();
    }

    @RequestMapping("/airport/{id}")
    public Airport getAirport(@PathVariable int id) {
        return airportService.getAirport(id);
    }

    @PostMapping(value = "/airports", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void addAirport(@RequestBody Airport airport) {
        airportService.addAirport(airport);
    }

    @PutMapping(value = "/airports/{id}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public void updateAirport(@RequestBody Airport airport, @PathVariable int id) {
        airportService.updateAirport(airport, id);
    }

    @DeleteMapping(value = "/airports/{id}")
    public void deleteAirport(@PathVariable int id) {
        airportService.deleteAirport(id);
    }

}