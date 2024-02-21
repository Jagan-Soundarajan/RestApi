package com.example.project.service;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Vendor;
import com.example.project.respository.vendorrepo;

@Service
public class Vendorservice {
    @Autowired
    vendorrepo vendorrepo;
    public Vendor addvendor(Vendor vendor)
    {
        return vendorrepo.save(vendor);
    }
    public List<Vendor> getvendor()
    {
        return vendorrepo.findAll();
    }
    public Optional<Vendor> getvendorById(int id)
    {
        return vendorrepo.findById(id);
    }

    public String delete(int id)
    {
        vendorrepo.deleteById(id);
        return "Deleted";
    }
    public Vendor put(int id,Vendor po)
    {
        Vendor user=vendorrepo.findById(id).orElse(null);
        if(user!=null)
        {
           
            user.setName(po.getName());
            user.setPassword(po.getPassword());
            user.setEmail(po.getEmail());
            user.setPhone(po.getPhone());
            return vendorrepo.saveAndFlush(user);
        }
        else{
            return null;
        }
    }
}

   
