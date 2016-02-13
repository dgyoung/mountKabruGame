/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKabru.Player;

/**
 *
 * @author Moose
 */
public class PlayerControl {
    public double spellAttack (double mana, double attack, double defence) {

    if (attack < 5 || attack > 305){
        return -1;	
                }
    if (mana < 5 || mana > 305 ){
        return -2;
    }
    if (defence < 5 || defence > 305){
        return -3;
    }
    double spellDamage = ((attack + mana)- defence) + (Math.random() * 10);
    return spellDamage;
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
    
    
    public void levelUp (double level, double exp, double attack, double dextarity, double defence, double mana, String attribute) {
        
        if ((level * 2) < attack){
            System.out.println(" currupt save " );
        } 
        if ((level * 2) < dextarity){
            System.out.println(" currupt save " );
        } 
        if ((level * 2) < defence){
            System.out.println(" currupt save " );
        } 
        if ((level * 2) < mana){
            System.out.println(" currupt save " );
        } 
        Player saveA = new Player();
        if (exp >= 10 * level * level){
            int random = (int )(Math.random() * 3);
            if ("bard".equals(attribute)){
                random = (int )(Math.random() * 3);
                attack = attack + random + 3;
                random = (int )(Math.random() * 3);
                dextarity = dextarity + random + 3;
                random = (int )(Math.random() * 3);
                defence = defence + random + 1;
                random = (int )(Math.random() * 3);
                mana = mana + random + 3;
                saveA.setAttack(attack);
                saveA.setDexterity(dextarity);
                saveA.setDefense(defence);
                saveA.setMana(mana);
            }
            else if ("warrior".equals(attribute)){
                random = (int )(Math.random() * 3);
                attack = attack + random + 4;
                random = (int )(Math.random() * 3);
                dextarity = dextarity + random + 2;
                random = (int )(Math.random() * 3);
                defence = defence + random + 2;
                random = (int )(Math.random() * 3);
                mana = mana + random + 2;
                saveA.setAttack(attack);
                saveA.setDexterity(dextarity);
                saveA.setDefense(defence);
                saveA.setMana(mana);
            }
            else if ("mage".equals(attribute)){
                random = (int )(Math.random() * 3);
                attack = attack + random + 2;
                random = (int )(Math.random() * 3);
                dextarity = dextarity + random + 2;
                random = (int )(Math.random() * 3);
                defence = defence + random + 1;
                random = (int )(Math.random() * 3);
                mana = mana + random + 4;
                saveA.setAttack(attack);
                saveA.setDexterity(dextarity);
                saveA.setDefense(defence);
                saveA.setMana(mana);
            }
            else {
                System.out.println(" invalid class " );
            }
        }
    }
}