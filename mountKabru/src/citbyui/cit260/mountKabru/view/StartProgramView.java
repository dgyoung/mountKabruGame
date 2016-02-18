/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

/**
 *
 * @author David
 */
public class StartProgramView { 
    
    private String promptMessage;
    
    public StartProgramView(){
        
        this.promptMessage = "\nPlease enter your name: ";
    
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println(
          "\n******************************************************"
        + "\n*                                                    *"
        + "\n* Welcome to Mount Kabru                             *"
        + "\n* In this game you will be an adventurer who will    *"
        + "\n* battle monsters and bandets in the hopes to face   *"
        + "\n* the great master.                                  *"
        + "\n*                                                    *"
        + "\n* You have a long jurney ahead of you and have a lot *"
        + "\n* to learn. As you fight monsters you will grow in   *"
        + "\n* strenth and power in hopes that one day you may    *"
        + "\n* prove your worth.                                  *"
        + "\n*                                                    *"
        + "\n* May goodfortune follow you on your quest.          *"
        + "\n*                                                    *"
        + "\n******************************************************"
        );
    }
}
