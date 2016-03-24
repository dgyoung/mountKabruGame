/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import byui.MountKabru.exceptions.ActorControlException;

/**
 *
 * @author Moose
 */
public class ActorsControl {

    public static double spellAttack(double mana, double attack, double defence) throws ActorControlException {

        if (attack < 5 || attack > 305) {
            throw new ActorControlException("the attack is either less then 5 or greater then 305");
        }
        if (mana < 5 || mana > 305) {
            throw new ActorControlException("the Mana is either less then 5 or greater then 305");
        }
        if (defence < 5 || defence > 305) {
            throw new ActorControlException("the Defence is either less then 5 or greater then 305");
        }
        double spellDamage = ((attack + mana) - defence) + (Math.random() * 10);
        if (spellDamage > 0) {
            return spellDamage;
        }
        
        return 0;
    }

    public static double strengthAttack(double strength, double attack, double defence) throws ActorControlException {

        if (attack < 5 || attack > 305) {
            throw new ActorControlException("the attack is either less then 5 or greater then 305");
        }
        if (strength < 5 || strength > 305) {
            throw new ActorControlException("the Strength is either less then 5 or greater then 305");
        }
        if (defence < 5 || defence > 305) {
            throw new ActorControlException("the defence is either less then 5 or greater then 305");
        }
        double spellDamage = ((attack + strength) - defence) + (Math.random() * 10);
        return spellDamage;
    }
}
