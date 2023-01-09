package com.proiect.management.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDto {
    private int id;
    private String location_name;
    private String address;
    private String image_location;
    private double price_per_hour;
    private double location_x;
    private double location_y;
}
