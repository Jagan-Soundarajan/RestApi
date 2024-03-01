package com.example.project.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vendormanagement")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int vendorId;
    public String name;
    public String password;
    public String email;
    public String phone;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="vendor_id")
    List<Customer> customer=new ArrayList<>();
   
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public List<Customer> getCustomer() {
        return customer;
    }
    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
    public int getVendorId() {
        return vendorId;
    }
    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }
   
    
    
}
