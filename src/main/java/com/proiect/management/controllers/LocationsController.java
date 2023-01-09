package com.proiect.management.controllers;

import com.proiect.management.dtos.LocationDto;
import com.proiect.management.services.implementation.ServiceLocations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationsController {

    @Autowired
    private ServiceLocations serviceLocations;


    @GetMapping(value = "/rest/Location")  // http://localhost:8080/rest/Location?id=0
    public LocationDto displayLocationDto(@RequestParam(value="id", defaultValue = "0") int code) {
        return this.serviceLocations.SearchById(code);
    }

    @GetMapping(value = "/rest/Location/all")  // http://localhost:8080/rest/Location/all
    public List<LocationDto> displayAllLocation() {
        return serviceLocations.GetAll();
    }

    @PostMapping(value = "/rest/Location/add")
    public ResponseEntity<LocationDto> addLocation(@RequestBody LocationDto inputLocationDto) {
        LocationDto LocationDto = this.serviceLocations.Insert(inputLocationDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(LocationDto);
    }

    @PutMapping(value = "/rest/Location/update")
    public ResponseEntity<LocationDto> updateLocation(@RequestBody LocationDto inputLocationDto) {
        LocationDto LocationDto = this.serviceLocations.Update(inputLocationDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(LocationDto);
    }

    @DeleteMapping(value = "/rest/Location/delete")
    public boolean deleteLocation(@RequestBody LocationDto inputLocationDto) {
        return this.serviceLocations.Delete(inputLocationDto);
    }

}