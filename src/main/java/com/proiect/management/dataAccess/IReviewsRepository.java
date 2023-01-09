package com.proiect.management.dataAccess;


import com.proiect.management.domains.Review;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IReviewsRepository extends JpaRepository<Review, Integer> {
}