/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

/**
 *
 * @author Moose
 */
public class ActorsControl {
    public double spellAttack (double mana, double attack, double defence) {

    if (attack < 5 || attack > 100){
        return -1;	
                }
    if (mana < 5 || mana > 100 ){
        return -2;
    }
    if (defence < 5 || defence > 100){
        return -3;
    }
    double spellDamage = ((attack + mana)- defence) + (Math.random() * 10);
    return spellDamage;
    }
}