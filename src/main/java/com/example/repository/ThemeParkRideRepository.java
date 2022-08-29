package com.example.repository;


import java.util.List;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.ThemeParkRide;

@Repository
public interface ThemeParkRideRepository extends CouchbaseRepository<ThemeParkRide, String> {
    List<ThemeParkRide> findByName(String name);
}