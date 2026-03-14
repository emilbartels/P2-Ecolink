package com.example.demo.controller;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EcoPointListItemDTO;
import com.example.demo.service.EcoPointService;

@RestController
@RequestMapping("/api")
public class EcopointController {

    private final EcoPointService ecoPointService;

    public EcopointController(EcoPointService ecoPointService) {
        this.ecoPointService = ecoPointService;
    }

    @GetMapping("/ecopoints") // vores URL bliver GET /api/ecopoints
    public ResponseEntity<?> getEcoPoints(
            @RequestParam(required = false) Double lat, 
            @RequestParam(required = false) Double lng,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit) { // RequestParam læser ?lat=, ?lng=, ?page=, ?limit= 
			// fra URL'en Hvis page < 1 eller limit > 50 returneres HTTP 400 med fejlbesked 
			// Ellers returneres et JSON-svar med success, data og pagination

        if (page < 1 || limit < 1 || limit > 50) {
            return ResponseEntity.badRequest().body(Map.of(
                    "success", false,
                    "message", "Invalid pagination parameters"
            ));
        }

        Page<EcoPointListItemDTO> result = ecoPointService.getEcoPoints(lat, lng, page, limit);

        return ResponseEntity.ok(Map.of(
                "success", true,
                "data", result.getContent(),
                "pagination", Map.of(
                        "page", page,
                        "limit", limit,
                        "total", result.getTotalElements(),
                        "totalPages", result.getTotalPages()
                )
        ));
    }
}