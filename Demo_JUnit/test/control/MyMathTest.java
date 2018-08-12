/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.MyMath;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HAMIDREZA
 */
public class MyMathTest {
    static MyMath instance;

    public MyMathTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        instance = MyMath.getInstance();
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
     * Test of getInstance method, of class MyMath.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        //MyMath instance = MyMath.getInstance();
        assertNotNull(instance);
    }

    /**
     * Test of division method, of class MyMath.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        //MyMath instance = new MyMath();
        assertEquals(2, instance.division(4, 2));
        assertEquals(0, instance.division(0, 5));
        
        try {
            instance.division(5, 0);
            //The test shoild never reach this line
            fail();
        } catch (ArithmeticException ex) {
            assertTrue(ex instanceof ArithmeticException);
        }
        try{
            instance.division(0, 0);
            fail();
        }catch(ArithmeticException ex){
            assertTrue(ex instanceof ArithmeticException);
        }

    }

    /**
     * Test of multiply method, of class MyMath.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        //MyMath instance = new MyMath();
        assertEquals(20, instance.multiply(4, 5));
        assertEquals(0, instance.multiply(0, 3));
        assertEquals(0, instance.multiply(0, 0));

    }

}
