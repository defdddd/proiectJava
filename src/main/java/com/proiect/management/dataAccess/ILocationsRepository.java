package com.proiect.management.dataAccess;


import com.proiect.management.domains.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ILocationsRepository extends JpaRepository<Location, Integer> {
}
