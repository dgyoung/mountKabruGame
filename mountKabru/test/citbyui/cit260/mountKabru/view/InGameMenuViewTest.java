/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Moose
 */
public class InGameMenuViewTest {
    
    public InGameMenuViewTest() {
    }

    /**
     * Test of displayInGameMenuView method, of class InGameMenuView.
     */
    @Test
    public void testDisplayInGameMenuView() {
        System.out.println("displayInGameMenuView");
        InGameMenuView instance = new InGameMenuView();
        instance.displayInGameMenuView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class InGameMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String choice = "";
        InGameMenuView instance = new InGameMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(choice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
