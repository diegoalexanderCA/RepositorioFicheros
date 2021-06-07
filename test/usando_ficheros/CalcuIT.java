/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usando_ficheros;

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
public class CalcuIT {
    
    public CalcuIT() {
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
     * Test of suma method, of class Calcu.
     */
    @Test
    public void testSuma() {
        Calcu c1 = new Calcu(1, 2);
        int expResult = 3;
        int result = c1.suma();
        assertEquals(expResult, result);
        
        //fail("The test case is a prototype*******.");
    }

    /**
     * Test of cadenaEnteros method, of class Calcu.
     */
    @Test(expected = NegativeArraySizeException.class)
    public void testCadenaEnteros1() {
        Calcu c1 = new Calcu(0, 0);
        c1.cadenaEnteros(-2);
        
        //fail("The test case is a prototype.");
    }
    /**
     * Test of cadenaEnteros method, of class Calcu.
     */
    @Test(expected = NegativeArraySizeException.class)
    public void testCadenaEnteros2() {
        Calcu c1 = new Calcu(0, 0);
        c1.cadenaEnteros(20);
        
        //fail("The test case is a prototype.");
    }
    
    
    
}
