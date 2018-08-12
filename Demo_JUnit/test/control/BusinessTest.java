/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author HAMIDREZA
 */
public class BusinessTest {
    
    public BusinessTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of throwsException method, of class Business.
     */
    @Test(expected = RuntimeException.class)
    public void testThrowsException() {
        System.out.println("throwsException");
        Business instance = new Business();
        instance.throwsException();
    }

    /**
     * Test of multiply method, of class Business.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Business instance = new Business();
        double expResult = 3.0;
        double result = instance.multiply(1.5, 2.0);
        assertEquals(expResult, result, 0.0001);
    }
    
    @Ignore
    @Test
    public void incompletedTest(){
        Business instance = new Business();
        assertEquals(0, instance.multiply(0, 0));
    }
    
}
