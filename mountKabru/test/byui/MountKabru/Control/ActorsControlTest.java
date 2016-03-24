/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import byui.MountKabru.exceptions.ActorControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Moose
 */
public class ActorsControlTest {
    
    public ActorsControlTest() {
    }

    /**
     * Test of spellAttack method, of class ActorsControl.
     */
    @Test
    public void testSpellAttack() {
        System.out.println("spellAttack");
        double mana = 20.0;
        double attack = 25.0;
        double defence = 15.0;
        ActorsControl instance = new ActorsControl();
        double result = 0;
            try{    
                result = instance.spellAttack(mana, attack, defence);
            } catch (ActorControlException me) {
                System.out.println(me.getMessage());
            }
        assertTrue(result > 30 && result < 41);
        // TODO review the generated test code and remove the default call to fail.
        }

    /**
     * Test of strangthAttack method, of class ActorsControl.
     */
    @Test
    public void testStrangthAttack() {
        System.out.println("strangthAttack");
        double strangth = 20.0;
        double attack = 25.0;
        double defence = 15.0;
        ActorsControl instance = new ActorsControl();
        double result = instance.strangthAttack(strangth, attack, defence);
        assertTrue(result > 30 && result < 41);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
