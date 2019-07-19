package com.example.mvc;

import java.util.List;

public interface ICustomerService {
    
    public List<Customer> findAll();
    public int count();
    public void findByFirstName(String firstName);
    
    
    
}
