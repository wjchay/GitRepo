package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldControllerTest {

    HelloWorldController controller;

    @Before
    public void setUp() throws Exception {
        controller = new HelloWorldController();
    }

    @After
    public void tearDown() throws Exception {
        controller = null;
    }

    @Test
    public void testHello() {
        assertTrue(controller.hello().equals("Hello World (again)!!!"));
    }

}
