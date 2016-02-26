/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.HelpControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author David
 */
public class BattleMenuView
{
    private String menu;
    public BattleMenuView() {
        this.menu = "\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n | You are in a fight what will you do?                                       |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nA - Attack"
                        +"\nS - Spell Attack"
                        +"\nI - Open Invatory"
                        +"\nR - Run"
                        +"\n-------------------------------------------------------------------------------";
    }
        
    
  // void displayMainMenuView() {
    //    System.out.println("\n*** DisplayMenu() called.");
        
  //  }

  public  void displayBattleMenuView() {
     
      boolean done = false; // set flage to not done
      do {
          int i = 0;
          
          // prompt for and get players name
          do{
            
          String menuOption = this.getMenuOption();    
          if (menuOption.toUpperCase().equals("R")){ // user wants to quit
              double random = Math.random();
              if (random <= .5){
                  System.out.println("You Ran away.");
              i++;
              return;
              
              }
           else {
              System.out.println("Failed to run");
          }
          }
          done = this.doAction(menuOption);
          } while (i < 1);
          
          // do the requwsted action and display the next view
          
             
      } while ( !done);
  }     

    private String getMenuOption() {
       Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid){
            System.out.println("\n" + this.menu);
            
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
    public boolean doAction(String choice) 
    {
                 choice = choice.toUpperCase();
        
        switch (choice) {
            case "A" :
                this.attack();
                break;
            case "S" :
                this.spellAttack();
                break;  
            case "I" :
                this.openInvatory();
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

    private void spellAttack() {
        System.out.println("\nspell attack");
    }

    private void openInvatory() {
        System.out.println("\nopen invatory");
    }



} 
