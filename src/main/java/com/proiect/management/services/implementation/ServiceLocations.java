package com.proiect.management.services.implementation;


import com.proiect.management.dataAccess.factory.Factory;
import com.proiect.management.domains.Location;
import com.proiect.management.dtos.LocationDto;
import com.proiect.management.services.contracts.IServiceLocations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceLocations implements IServiceLocations {
    @Autowired
    private Factory factory;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<LocationDto> GetAll() {

        var list = factory.locationsRepository.findAll();

        var returnedList = new ArrayList<LocationDto>();

        for (var elem : list) {
            returnedList.add(mapper.map(elem, LocationDto.class));
        }

        return returnedList;
    }

    @Override
    public LocationDto Insert(LocationDto value) {

        var Location = mapper.map(value, Location.class);

        var LocationDto  = mapper.map(factory.locationsRepository.save(Location), LocationDto.class);

        return LocationDto;
    }

    @Override
    public LocationDto Update(LocationDto value) {

        var Location = mapper.map(value, Location.class);

        var LocationDto  = mapper.map(factory.locationsRepository.save(Location), LocationDto.class);

        return LocationDto;
    }

    @Override
    public LocationDto SearchById(int id) {

        var LocationDto  = mapper.map(factory.locationsRepository.findById(id), LocationDto.class);

        return  LocationDto;
    }

    @Override
    public boolean Delete(LocationDto value) {
        try{

            var Location = mapper.map(value, Location.class);

            factory.locationsRepository.delete(Location);

            return  true;

        }catch (Exception e){
            return  false;
        }
    }
}
