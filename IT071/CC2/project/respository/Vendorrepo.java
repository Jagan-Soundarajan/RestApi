package com.example.project.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Vendor;

@Repository
public interface Vendorrepo extends JpaRepository<Vendor,Integer> {
    
}
