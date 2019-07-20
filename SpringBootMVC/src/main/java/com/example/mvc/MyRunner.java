package com.example.mvc;

import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(MyRunner.class);
    
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        log.info("Init: Creating customers...");
        customerRepository.save(new Customer("Jack", "Bauer"));
        customerRepository.save(new Customer("Chloe", "O'Brian"));
        customerRepository.save(new Customer("Kim", "Bauer"));
        customerRepository.save(new Customer("David", "Palmer"));
        customerRepository.save(new Customer("Michelle", "Dessler"));
        log.info("Customers created.");
    }
    
    
}
