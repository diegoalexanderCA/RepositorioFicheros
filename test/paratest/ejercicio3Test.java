/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paratest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oboe
 */
public class ejercicio3Test {
    
    public ejercicio3Test() {
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
     * Test of cadenaEnteros method, of class Calcu.
     */
    @Test(expected = NegativeArraySizeException.class)
    public void testCadenaEnteros1() {
        ejercicio3 ej = new ejercicio3();
        ej.cadenaEnteros(-2);
        
        //fail("The test case is a prototype.");
    }
    /**
     * Test of cadenaEnteros method, of class Calcu.
     */
    @Test(expected = NegativeArraySizeException.class)
    public void testCadenaEnteros2() {
        ejercicio3 ej = new ejercicio3();
        ej.cadenaEnteros(20);
        
        //fail("The test case is a prototype.");
    }
    
}
