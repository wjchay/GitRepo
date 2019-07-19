package com.example.mvc;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository repository;
    
    @Override
    public List<Customer> findAll() {
        Iterable<Customer> it = repository.findAll();    
        List<Customer> customers = new ArrayList<Customer>();
        it.forEach(e -> customers.add(e));
        return customers;
    }
    
    @Override
    public int count() {
        log.info("counting.." + Long.valueOf(repository.count()).intValue());
        return Long.valueOf(repository.count()).intValue();
    }
    
    @Override
    public void findByFirstName(String firstName) { // fetch customers by firstname 
        log.info("Customer found with findByFirstName(String):" + firstName);
        log.info("--------------------------------------------");
        repository.findByFirstName(firstName).forEach(fname -> {
            log.info(fname.toString()); 
        }); 
        log.info(""); 
    }

    
    
}
