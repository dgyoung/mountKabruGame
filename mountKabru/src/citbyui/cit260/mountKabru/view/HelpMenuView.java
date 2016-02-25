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
public class HelpMenuView
{
    private String menu;
    public HelpMenuView() {
        this.menu = "\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n | Help Menu                                                           |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nN - How to move"
                        +"\nG - About the game"
                        +"\nS - How to fight"
                        +"\nQ - Quit"
                        +"\n-------------------------------------------------------------------------------";
    }
        
    
  // void displayMainMenuView() {
    //    System.out.println("\n*** DisplayMenu() called.");
        
  //  }

  public  void displayHelpMenuView() {
     
      boolean done = false; // set flage to not done
      do {
          // prompt for and get players name
          String menuOption = this.getMenuOption();
          if (menuOption.toUpperCase().equals("Q")) // user wants to quit
              return; // exit the game
          
          // do the requwsted action and display the next view
          done = this.doAction(menuOption);
             
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
            case "N" :
                this.howToMove();
                break;
          case "G" :
                this.aboutTheGame();
                break;  
           case "S" :
                this.howToFight();
                break;               
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }

    

    private void howToMove() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void aboutTheGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void howToFight() {
       System.out.println("*** displayHelpMenu function called ***");
    }
} 
