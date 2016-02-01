/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import Classes.CIT260.MountKabru.Items;
import Classes.CIT260.MountKabru.BattleScene;
import Classes.CIT260.MountKabru.Location;
import Classes.CIT260.MountKabru.Map;
import Classes.CIT260.MountKabru.Player;
import Classes.CIT260.MountKabru.Scene;

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
        
        Location curentLocation = new Location();
        curentLocation.setLevel(2);
        curentLocation.setStage(2);
        
        Map mapSize = new Map();
        mapSize.setLevelCount(20);
        mapSize.setStageCount(10); 
        
        Scene newScene = new Scene();
        newScene.setDescription("the yellow tower");
        
        BattleScene battle = new BattleScene();
        battle.setActor("joe");
        battle.setAttribute("Wind");
        battle.setReward("1000 gold");
        
        String info=battle.toString();
        System.out.println(info);
        
        Items knife = new Items();
        knife.setName("sharpstick");
        knife.setType("wood");
        knife.setAfect("stab");
        knife.setPower(3);
        
       
    }
    
}
