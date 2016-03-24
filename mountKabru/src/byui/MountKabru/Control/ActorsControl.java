/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKapru.exceptions.AttackControlException;

/**
 *
 * @author Moose
 */
public class ActorsControl {
    public static void spellAttack (double mana, double attack, double defence)
                                    throws AttackControlException {
        
    if (attack < 5 || attack > 305){
        throw new AttackControlException("invalid save file "
                + "please start a new game");	
    }
    if (mana < 5 || mana > 305 ){
        throw new AttackControlException("invalid save file "
                + "please start a new game");	
                
    }
    if (defence < 5 || defence > 305){
        throw new AttackControlException("invalid save file "
                + "please start a new game");	
                
    }
    double spellDamage = ((attack + mana)- defence) + (Math.random() * 10);
    
    }


    public double strangthAttack (double strangth, double attack, double defence) {

    if (attack < 5 || attack > 305){
        return -1;	
                }
    if (strangth < 5 || strangth > 305 ){
        return -2;
    }
    if (defence < 5 || defence > 305){
        return -3;
    }
    double spellDamage = ((attack + strangth)- defence) + (Math.random() * 10);
    return spellDamage;
    }
}