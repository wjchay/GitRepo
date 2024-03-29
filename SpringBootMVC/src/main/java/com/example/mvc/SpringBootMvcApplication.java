package com.example.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {CustomerRepository.class})
public class SpringBootMvcApplication {
    //private static final Logger log = LoggerFactory.getLogger(SpringBootMvcApplication.class);
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcApplication.class, args);
	}

	/*
	@Bean
    public CommandLineRunner myDemo(CustomerRepository repository) {
	    
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            //repository.findById(Long.valueOf(1)) // another way to use id
            repository.findById(1L)
                .ifPresent(customer -> {
                    log.info("Customer found with findById(1L):");
                    log.info("--------------------------------");
                    log.info(customer.toString());
                    log.info("");
                });

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            log.info("");
            
            // fetch customers by first name
            log.info("Customer found with findByFirstName('Kim'):");
            log.info("--------------------------------------------");
            repository.findByFirstName("Kim").forEach(kim -> {
                log.info(kim.toString());
            });
            log.info("");
        };
    }
	
	@Bean // this bean annotation is required to make it run!
	public CommandLineRunner dummy() {
	    return (args) -> {
	        log.info("dummy executed!"); 
	    };
    }
	*/
	
}
