package com.proiect.management.services.implementation;


import com.proiect.management.dataAccess.factory.Factory;
import com.proiect.management.domains.Booking;
import com.proiect.management.dtos.BookingDto;
import com.proiect.management.services.contracts.IServiceBookings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceBookings implements IServiceBookings {
    @Autowired
    private Factory factory;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<BookingDto> GetAll() {

        var list = factory.bookingsRepository.findAll();

        var returnedList = new ArrayList<BookingDto>();

        for (var elem : list) {
            returnedList.add(mapper.map(elem, BookingDto.class));
        }

        return returnedList;
    }

    @Override
    public BookingDto Insert(BookingDto value) {

        var Booking = mapper.map(value, Booking.class);

        var BookingDto  = mapper.map(factory.bookingsRepository.save(Booking), BookingDto.class);

        return BookingDto;
    }

    @Override
    public BookingDto Update(BookingDto value) {

        var Booking = mapper.map(value, Booking.class);

        var BookingDto  = mapper.map(factory.bookingsRepository.save(Booking), BookingDto.class);

        return BookingDto;
    }

    @Override
    public BookingDto SearchById(int id) {

        var BookingDto  = mapper.map(factory.bookingsRepository.findById(id), BookingDto.class);

        return  BookingDto;
    }

    @Override
    public boolean Delete(BookingDto value) {
        try{

            var Booking = mapper.map(value, Booking.class);

            factory.bookingsRepository.delete(Booking);

            return  true;

        }catch (Exception e){
            return  false;
        }
    }
}
