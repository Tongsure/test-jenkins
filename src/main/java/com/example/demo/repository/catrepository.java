package com.example.demo.repository;

import com.example.demo.dtos.reponseDto;
import com.example.demo.repository.entity.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface catrepository extends JpaRepository<category,String > {
    category findByCustId(String custId);

    @Query(value = """
            SELECT
            cust_id,
            cust_cate
            FROM tbl_cust_cate
            """,nativeQuery = true)
    List<reponseDto> data();
}
