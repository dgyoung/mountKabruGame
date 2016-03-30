/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Actor;
import byui.MountKabru.Control.GameControl;
import byui.MountKabru.exceptions.GameControlException;
import java.io.IOException;
import java.util.Arrays;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class PrintOutView extends View {

    public PrintOutView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | Dapper Dan pulls out a quill and asks                        |"
                + "\n | 'so what do you want me to write ?'                            |"
                + "\n------------------------------------------------------------------------------"
                + "\nN - Write out a list for Monsters and there location"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------------------------------");

    }

    
    
     
    @Override
    public boolean doAction(String choice) {
     
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.listMonsters();
                break;
            default:
                ErrorView.display("PrintOutView ", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

   public void listMonsters( ) {
    Actor[] monsters = Actor.values();
    String[] monsterNames = new String[monsters.length];
          String listMonsters = "\n"
                + "\n|--------------------------------------------------|"
                + "\n|                                                  |"
                + "\n|     ****        Monster  List     ****       |"
                + "\n|                                                  |"
                + "\n|--------------------------------------------------|"
                + "\n The Monsters                               "
                + "\n----Monters-------------------Locations-----------------------------"
          
                + "\n--------------------------------------";
   for (int i=0; i<monsters.length; i++){
            monsterNames[i] = monsters[i].getName() + monsters[i].getLocation();
        }
        
        Arrays.sort(monsterNames);
        
        for (int i=0;i<monsterNames.length;i++){
            
            this.console.println("monster names: " +monsterNames[i] );
        }
    }
}

   

            



  