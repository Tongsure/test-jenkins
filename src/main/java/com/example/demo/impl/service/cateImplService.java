package com.example.demo.impl.service;

import com.example.demo.dtos.reponseDto;
import com.example.demo.repository.entity.category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface cateImplService {
    List<reponseDto> findCust(String custId);
}
