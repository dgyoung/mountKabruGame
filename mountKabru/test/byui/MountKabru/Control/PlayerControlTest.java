/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Moose
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }

    /**
     * Test of spellAttack method, of class PlayerControl.
     */
    @Test
    public void testSpellAttack() {
        System.out.println("spellAttack");
        double mana = 20.0;
        double attack = 25.0;
        double defence = 15.0;
        PlayerControl instance = new PlayerControl();
        double result = instance.spellAttack(mana, attack, defence);
        assertTrue(result > 30 && result < 41);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of strangthAttack method, of class PlayerControl.
     */
    @Test
    public void testStrangthAttack() {
        System.out.println("strangthAttack");
        double strangth = 20.0;
        double attack = 25.0;
        double defence = 15.0;
        PlayerControl instance = new PlayerControl();
        double expResult = 0.0;
        double result = instance.strangthAttack(strangth, attack, defence);
        assertTrue(result > 30 && result < 41);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
