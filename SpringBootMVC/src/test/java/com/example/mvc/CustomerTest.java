package com.example.mvc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testEqualsObject_DefaultConstructor() {
        Customer o1 = new Customer();
        Customer o2 = new Customer();
        
        assertTrue(
            "Instances with default constructor are not equal", o1.equals(o2));
        assertTrue(
            "Instances with default constructor are not equal", o2.equals(o1));
    }
    
    
    @Test
    void testEqualsTrueObject_2ArgConstructor() {
        Customer o1 = new Customer("fname", "lname");
        Customer o2 = new Customer("fname", "lname");
        
        assertTrue(
            "Instances with 2 args constructor are not equal", o1.equals(o2));
        assertTrue(
            "Instances with 2 args constructor are not equal", o2.equals(o1));
    }
    
    
    @Test
    void testEqualsObject_2ArgConstructor() {
        Customer o1 = new Customer("fname", "lname");
        Customer o2 = new Customer("fname", "lname");
        assertEquals(o1, o2);
    }
    
    
    @Test
    void testNotNull() {
        Customer o1 = null;
        Customer o2 = new Customer("fname", "lname");
        assertNotEquals(o1, o2);
    }
    
    @Test
    void test_OneObjFirstNameNull() {
        Customer o1 = new Customer(null, "lname");
        Customer o2 = new Customer("fname", "lname");
        assertNotEquals(o1, o2);
    }
    
    @Test
    void test_OneObjLastNameNull() {
        Customer o1 = new Customer("fname", "lname");
        Customer o2 = new Customer("fname", null);
        assertNotEquals(o1, o2);
    }
    
    @Test
    void test_OneObjFirstNameDiffValue() {
        Customer o1 = new Customer("fname1", "lname");
        Customer o2 = new Customer("fname", "lname");
        assertNotEquals(o1, o2);
    }
    
}
