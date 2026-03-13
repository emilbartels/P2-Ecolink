package com.example.demo.repository;

import com.example.demo.model.Ecopoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public class RepositoryEcopointsFromDB {

    @Query("{ location: { $nearSphere: { $geometry: { type: 'Point', coordinates: [?0, ?1] }, $maxDistance: 10000 } } }")
    List<Ecopoint> findNearby(double longitude, double latitude, double maxDistance);
    }