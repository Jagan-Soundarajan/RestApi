package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Vendor;
import com.example.project.service.Vendorservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Vendorcontroller {
    @Autowired
    Vendorservice p;
    @GetMapping("/getproduct/{pn}/{n}")
    public  List<Vendor> getMethod(@PathVariable int pn,@PathVariable int n) {
        return p.getvendor(pn,n);
    }

    @PostMapping("/addproduct")
    public Vendor postMethodName(@RequestBody Vendor entity) {
        return p.addvendor(entity);
    }

    @GetMapping("/getproduct/{id}")
    public Optional<Vendor> getbyId(@PathVariable int id) {
        return p.getvendorById(id);
    }

    @PutMapping("/putproduct/{id}")
    public Vendor putMethodName(@PathVariable int id, @RequestBody Vendor entity) {
        return p.put(id, entity);
    }

    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return p.delete(id);
    }



    
    
    
}
