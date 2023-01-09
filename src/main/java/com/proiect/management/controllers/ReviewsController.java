package com.proiect.management.controllers;

import com.proiect.management.dtos.ReviewDto;
import com.proiect.management.services.implementation.ServiceReviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewsController {

    @Autowired
    private ServiceReviews serviceReviews;


    @GetMapping(value = "/rest/Review")  // http://localhost:8080/rest/Review?id=0
    public ReviewDto displayReviewDto(@RequestParam(value="id", defaultValue = "0") int code) {
        return this.serviceReviews.SearchById(code);
    }

    @GetMapping(value = "/rest/Review/all")  // http://localhost:8080/rest/Review/all
    public List<ReviewDto> displayAllReview() {
        return serviceReviews.GetAll();
    }

    @PostMapping(value = "/rest/Review/add")
    public ResponseEntity<ReviewDto> addReview(@RequestBody ReviewDto inputReviewDto) {
        ReviewDto ReviewDto = this.serviceReviews.Insert(inputReviewDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(ReviewDto);
    }

    @PutMapping(value = "/rest/Review/update")
    public ResponseEntity<ReviewDto> updateReview(@RequestBody ReviewDto inputReviewDto) {
        ReviewDto ReviewDto = this.serviceReviews.Update(inputReviewDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(ReviewDto);
    }

    @DeleteMapping(value = "/rest/Review/delete")
    public boolean deleteReview(@RequestBody ReviewDto inputReviewDto) {
        return this.serviceReviews.Delete(inputReviewDto);
    }

}