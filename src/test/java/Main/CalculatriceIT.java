package Main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author victo
 */
public class CalculatriceIT {
    
    public CalculatriceIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Calculatrice.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculatrice.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Calculatrice.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 3;
        Calculatrice instance = new Calculatrice();
        int expResult = 5;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
