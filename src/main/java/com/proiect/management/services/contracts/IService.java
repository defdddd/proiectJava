package com.proiect.management.services.contracts;

import org.springframework.stereotype.Service;

import java.util.List;

public interface IService<T> {
        List<T> GetAll();
        T Insert(T value);
        T Update(T value);
        T SearchById(int id);
        boolean Delete(T value);
    }
