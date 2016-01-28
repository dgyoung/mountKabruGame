/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import Classes.CIT260.MountKabru.Player;

/**
 *
 * @author David
 */
public class MountKabru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setAttack("happy");
        playerOne.setDefense(7);
        playerOne.setDexterity(2);
        playerOne.setHealth(9000);
        playerOne.setInventory("inventory");
        playerOne.setLevel(-3);
        playerOne.setMana(5);
        playerOne.setName("Joe");
        playerOne.setSpell("lots");
        playerOne.setStrength(44);
    }
    
}
