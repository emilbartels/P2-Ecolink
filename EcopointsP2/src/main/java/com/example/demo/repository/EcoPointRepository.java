package com.example.demo.repository;

import com.example.demo.model.EcoPoint;
import com.example.demo.model.enums.MaterialType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EcoPointRepository extends MongoRepository<EcoPoint, String> {

	// US-033
	Optional<EcoPoint> findByIdAndIsActiveTrue(String id);

	// US-030
	Page<EcoPoint> findAllByIsActiveTrue(Pageable pageable);

	// US-032
	Page<EcoPoint> findByIsActiveTrueAndNameContainingIgnoreCaseOrIsActiveTrueAndAddressContainingIgnoreCase(
			String name, String address, Pageable pageable);

	// US-035
	Page<EcoPoint> findByIsActiveTrueAndAcceptedMaterialsContaining(
			MaterialType material, Pageable pageable);
}