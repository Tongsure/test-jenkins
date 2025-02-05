package com.example.demo.impl;

import com.example.demo.dtos.reponseDto;
import com.example.demo.impl.service.cateImplService;
import com.example.demo.repository.catrepository;
import com.example.demo.repository.entity.category;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Service
public class cateimpl implements cateImplService {

    private final catrepository  category;

    @Override
    public List<reponseDto> findCust(String custId) {
        System.out.println(category.findByCustId(custId));
        return  category.data();
    }
}
