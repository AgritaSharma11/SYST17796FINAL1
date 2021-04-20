/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_exam;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agrit
 */
public class AverageTest {
    
    public AverageTest() {
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
     * Test of calculateAverage method, of class Average.
     */
    @Test
    public void testCalculateAverage() {
        System.out.println("calculateAverage");
        double num1 = 0.0;
        double num2 = 3;
        double num3 = 0.0;
        Average instance = new Average();
        
        double result = instance.calculateAverage(num1, num2, num3);
        
        System.out.println("calculateAverage passed");
        
    }
    
}
