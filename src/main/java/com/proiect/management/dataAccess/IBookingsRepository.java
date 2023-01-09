package com.proiect.management.dataAccess;


import com.proiect.management.domains.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookingsRepository extends JpaRepository<Booking, Integer> {
}
