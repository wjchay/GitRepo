package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	/* 1 project cannot have more than 1 @SpringBootApplication, therefore this test is disabled
	@Test
    public void testMain() {
	    SpringBootDemoApplication.main(new String[] {});
    }
    */
}
