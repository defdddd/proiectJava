package com.proiect.management.controllers;

import com.proiect.management.dtos.BookingDto;
import com.proiect.management.services.implementation.ServiceBookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingsController {

    @Autowired
    private ServiceBookings serviceBookings;


    @GetMapping(value = "/rest/Booking")  // http://localhost:8080/rest/Booking?id=0
    public BookingDto displayBookingDto(@RequestParam(value="id", defaultValue = "0") int code) {
        return this.serviceBookings.SearchById(code);
    }

    @GetMapping(value = "/rest/Booking/all")  // http://localhost:8080/rest/Booking/all
    public List<BookingDto> displayAllBooking() {
        return serviceBookings.GetAll();
    }

    @PostMapping(value = "/rest/Booking/add")
    public ResponseEntity<BookingDto> addBooking(@RequestBody BookingDto inputBookingDto) {
        BookingDto BookingDto = this.serviceBookings.Insert(inputBookingDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(BookingDto);
    }

    @PutMapping(value = "/rest/Booking/update")
    public ResponseEntity<BookingDto> updateBooking(@RequestBody BookingDto inputBookingDto) {
        BookingDto BookingDto = this.serviceBookings.Update(inputBookingDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(BookingDto);
    }

    @DeleteMapping(value = "/rest/Booking/delete")
    public boolean deleteBooking(@RequestBody BookingDto inputBookingDto) {
        return this.serviceBookings.Delete(inputBookingDto);
    }

}