package com.example.demo.controllers;

import com.example.demo.dtos.reponseDto;
import com.example.demo.impl.service.cateImplService;
import com.example.demo.repository.entity.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/test")
public class cateController {
    @Autowired
    private cateImplService cateImplService;  
    @GetMapping("/testdata")
    public List<reponseDto> findCust(@RequestParam  String custId) {
        return  cateImplService.findCust(custId);
    }
}
