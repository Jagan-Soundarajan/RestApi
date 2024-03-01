package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdet")
public class Customer {
    @Id
    
    int customerId;
    String customerName;
    String customerAddress;
    String totalOrder;
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public String getTotalOrder() {
        return totalOrder;
    }
    public void setTotalOrder(String totalOrder) {
        this.totalOrder = totalOrder;
    }
    
    
}
