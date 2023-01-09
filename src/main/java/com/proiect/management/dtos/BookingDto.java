package com.proiect.management.dtos;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookingDto {
    private int id;
    private int account_id;
    private int location_id;
    private String phone_number;
    private String in_date;
    private String out_date;
    private double total_price;
}
