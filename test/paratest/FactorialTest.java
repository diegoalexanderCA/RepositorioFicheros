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
public class FactorialTest {
    
    public FactorialTest() {
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
     * Test of calculo method, of class Factorial.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculo1() {
        Factorial fac = new Factorial();
        fac.calculo(-2);
    }
    
    /**
     * Test of calculo method, of class Factorial.
     */
    @Test(expected = ArithmeticException.class)
    public void testCalculo2() {
        Factorial fac = new Factorial();
        fac.calculo(65842347);
    }
    
    
    
}
