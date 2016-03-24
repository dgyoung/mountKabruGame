/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Actors;
import Classes.CIT260.MountKabru.Player;
import Classes.CIT260.MountKapru.exceptions.AttackControlException;
import byui.MountKabru.Control.ActorsControl;
import byui.MountKabru.Control.HelpControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author David
 */
public class BattleMenuView extends View{
    
    public BattleMenuView() {
        super("\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n | You are in a fight! What will you do?                                       |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nA - Attack"
                        +"\nS - Spell Attack"
                        +"\nI - Open Inventory"
                        +"\nR - Run"
                        +"\n-------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(char choice) 
    {
                 
        
        switch (choice) {
            case 'A' :
                this.attack();
                break;
            case 'S' :
                this.spellAttack();
                break;  
            case 'I' :
                this.openInvatory();
                break;
            case 'R' :
                break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }

    private void attack() {
        System.out.println("\nyou attacked");
    }
    
    public void spellAttack() {
        Actors actors = null;
        Player player = null;
        double defence = player.getDefense();
        double mana = actors.getHealth();
        double attack = actors.getAttack();
        
        try {
            ActorsControl.spellAttack(mana, attack, defence);
        } catch (AttackControlException me) {
            
        }
    }

    private void openInvatory() {
        System.out.println("\nopen invatory");
    }



} 
