package com.proiect.management.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDto {
    private int id;
    private int account_id;
    private int location_id;
    private int grade;
    private String description;
    private String date;
}
