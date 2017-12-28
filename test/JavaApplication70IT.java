/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonsanro
 */
public class JavaApplication70IT {
    
    public JavaApplication70IT() {
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
     * Test of setValoresDeposito method, of class JavaApplication70.
     */
    @Test
    public void testSetValoresDeposito() {
        System.out.println("setValoresDeposito");
        String valor_idDeposito = "";
        float valor_diametro = 0.0F;
        float valor_altura = 0.0F;
        JavaApplication70 instance = new JavaApplication70();
        instance.setValoresDeposito(valor_idDeposito, valor_diametro, valor_altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiametro method, of class JavaApplication70.
     */
    @Test
    public void testGetDiametro() {
        System.out.println("getDiametro");
        JavaApplication70 instance = new JavaApplication70();
        float expResult = 0.0F;
        float result = instance.getDiametro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class JavaApplication70.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        JavaApplication70 instance = new JavaApplication70();
        float expResult = 0.0F;
        float result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdDeposito method, of class JavaApplication70.
     */
    @Test
    public void testGetIdDeposito() {
        System.out.println("getIdDeposito");
        JavaApplication70 instance = new JavaApplication70();
        String expResult = "";
        String result = instance.getIdDeposito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valorCapacidad method, of class JavaApplication70.
     */
    @Test
    public void testValorCapacidad() {
        System.out.println("valorCapacidad");
        JavaApplication70 instance = new JavaApplication70();
        float expResult = 0.0F;
        float result = instance.valorCapacidad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
