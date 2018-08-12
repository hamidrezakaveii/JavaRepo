/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author HAMIDREZA
 */
import org.junit.*;
import static org.junit.Assert.*;

public class TestFlow {
    private static int counter = 0;
    
    @AfterClass
    public static void tearDownClass(){
        System.out.println(counter);
    }
    
    //public TestFlow(){counter++;}
    
    @BeforeClass public static void setUpClass(){counter++;}
    @Before public void setup(){counter++;}
    @After public void tearDown(){counter++;}
    @Test public void testNormal(){counter++;}
    @Test public void testNullValue(){counter++;}
}
