package com.proiect.management.services.implementation;

import com.proiect.management.dataAccess.factory.Factory;
import com.proiect.management.domains.Review;
import com.proiect.management.dtos.ReviewDto;
import com.proiect.management.services.contracts.IServiceReviews;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceReviews implements IServiceReviews {
    @Autowired
    private Factory factory;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ReviewDto> GetAll() {

        var list = factory.reviewsRepository.findAll();

        var returnedList = new ArrayList<ReviewDto>();

        for (var elem : list) {
            returnedList.add(mapper.map(elem, ReviewDto.class));
        }

        return returnedList;
    }

    @Override
    public ReviewDto Insert(ReviewDto value) {

        var Review = mapper.map(value, Review.class);

        var ReviewDto  = mapper.map(factory.reviewsRepository.save(Review), ReviewDto.class);

        return ReviewDto;
    }

    @Override
    public ReviewDto Update(ReviewDto value) {

        var Review = mapper.map(value, Review.class);

        var ReviewDto  = mapper.map(factory.reviewsRepository.save(Review), ReviewDto.class);

        return ReviewDto;
    }

    @Override
    public ReviewDto SearchById(int id) {

        var ReviewDto  = mapper.map(factory.reviewsRepository.findById(id), ReviewDto.class);

        return  ReviewDto;
    }

    @Override
    public boolean Delete(ReviewDto value) {
        try{

            var Review = mapper.map(value, Review.class);

            factory.reviewsRepository.delete(Review);

            return  true;

        }catch (Exception e){
            return  false;
        }
    }
}
