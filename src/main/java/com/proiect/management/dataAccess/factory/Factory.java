package com.proiect.management.dataAccess.factory;

import com.proiect.management.dataAccess.IAccountsRepository;
import com.proiect.management.dataAccess.IBookingsRepository;
import com.proiect.management.dataAccess.ILocationsRepository;
import com.proiect.management.dataAccess.IReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Factory {
    @Autowired
    public IAccountsRepository accountsRepository;

    @Autowired
    public IBookingsRepository bookingsRepository;

    @Autowired
    public ILocationsRepository locationsRepository;

    @Autowired
    public IReviewsRepository reviewsRepository;
}
