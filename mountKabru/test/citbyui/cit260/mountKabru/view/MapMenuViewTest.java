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
public class MapMenuViewTest {
    
    public MapMenuViewTest() {
    }

    /**
     * Test of displayMapMenuView method, of class MapMenuView.
     */
    @Test
    public void testDisplayMapMenuView() {
        System.out.println("displayMapMenuView");
        MapMenuView instance = new MapMenuView();
        instance.displayMapMenuView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class MapMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String choice = "";
        MapMenuView instance = new MapMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(choice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
