/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Player;
import byui.MountKabru.Control.GameControl;
import java.util.Scanner;

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
        + "\n* battle monsters and bandits in the hopes to face   *"
        + "\n* the great master.                                  *"
        + "\n*                                                    *"
        + "\n* You have a long journey ahead of you and have a lot *"
        + "\n* to learn. As you fight monsters you will grow in   *"
        + "\n* strength and power in hopes that one day you may    *"
        + "\n* prove your worth.                                  *"
        + "\n*                                                    *"
        + "\n* May good fortune follow you on your quest.          *"
        + "\n*                                                    *"
        + "\n******************************************************"
        );
    }

    public void displayStartProgramView() {
        /*
        do
            prompt for and get the players name
            if (playersName == "q" then
                exit
            do the action and display the nest view
        while the action is not successful
        */
        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        /*
        WHILE valid value has not been entered
            DISPLAY promptMessage
            GET the value entered from keayboard
            Trim the front and trailing blanks off of the name
            IF the length of the value is blank THEN 
                DISPLAY "Invalid value: The value can not be blank"
                CONTINUE
            ENDIF
        
            BREAK
        
        ENDWHILE
        RETURN name
        */
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid){
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }
        

    private boolean doAction(String playersName) {
        //if the length of the playesName <2 then
            // display "invalid name: the name bust be > 1 character"
            // return false
        // create Player with specified name
        //if unscuccessful then
            // display "invalid naem: the same is too short
            //return false
            
        // display customized welcome message
        // display mainMenuView
        // return true
        
            if (playersName.length() < 2) {
                System.out.println("\nInvalid players name: "
                    + "the name must be greater than one character in length");
                return false;
            }
            Player player = GameControl.createPlayer(playersName);
            
            if (player == null) {
                System.out.println("\nError creating the player.");
                return false;
            }
            this.displayNextView(player);
            return true;
        
    }

    private void displayNextView(Player player) {
   
    // display a custom welcome message
    System.out.println("\n==================================="
                              + "\n Welcometo the game " +player.getName()
                              + "\n We Hope you have a lot of fun!"
                              + "\n=================================="
                              );     
    MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.display();
    
    }
}
