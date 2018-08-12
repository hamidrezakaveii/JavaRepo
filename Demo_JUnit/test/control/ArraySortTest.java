/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.ArraySort;
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
public class ArraySortTest {
    
    public ArraySortTest() {
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
     * Test of sort method, of class ArraySort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] array = {6, 3, 4, 2, 1, 5};
        control.ArraySort.sort(array);
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(sortedArray, array);
    }
    
}
