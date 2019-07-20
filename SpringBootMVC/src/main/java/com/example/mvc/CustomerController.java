package com.example.mvc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
    
    @Autowired 
    private ICustomerService customerService;
    
    /*
    @GetMapping("/customers")
    public String getCustomer(@RequestParam(name="firstName", required=false) String firstName, Model model) {
        customerService.findByFirstName(firstName);
        model.addAttribute("firstName", firstName);
        return "customer"; // this is pointing to customer.html
    }
    */
    
    @GetMapping("/customers")
    public String listCustomers(Model model) {
        List<Customer> customers = customerService.findAll();     
        model.addAttribute("customers", customers);
        model.addAttribute("count", customerService.count());
        return "customer"; // this is pointing to customer.html
    }
    
    @GetMapping("/customers/count")
    // not used
    public String count(Model model) {
        model.addAttribute("count", customerService.count());
        return "customer";
    }
}