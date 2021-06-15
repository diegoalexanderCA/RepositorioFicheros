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
public class FechaTest {
    
    public FechaTest() {
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
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha1() {
        
        Fecha fech = new Fecha();
        String expResult = "yyyy/MM";
        String result = fech.devuelveFecha(1);
        assertTrue(expResult.length()==result.length());
    }
    
    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha2() {
        
        Fecha fech = new Fecha();
        String expResult = "MM/yyyy";
        String result = fech.devuelveFecha(2);
        assertTrue(expResult.length()==result.length());
    }
    
    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha3() {
        
        Fecha fech = new Fecha();
        String expResult = "MM/yy";
        String result = fech.devuelveFecha(3);
        assertTrue(expResult.length()==result.length());
    }
    
    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha4() {
        
        Fecha fech = new Fecha();
        String expResult = "ERROR";
        String result = fech.devuelveFecha(15);
        assertTrue(expResult.compareTo(result)==0);
    }
    

    
    
}
