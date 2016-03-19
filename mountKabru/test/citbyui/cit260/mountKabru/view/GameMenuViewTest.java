/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class GameMenuViewTest {
    
    public GameMenuViewTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of doAction method, of class GameMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        char choice = ' ';
        GameMenuView instance = new GameMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(choice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
