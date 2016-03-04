/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.InGameControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class InGameMenuView
{
    private String menu;
    public InGameMenuView() {
        this.menu = "\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n|  In Game Menu                                                     |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nM - Map"
                        +"\nB - Battle Your Foe "
                        +"\nA - Main Menu"
                        + "\nI - Invantory"
                        +"\nQ - Quit"
                        +"\n-------------------------------------------------------------------------------";
    }
        
    
  // void displayMainMenuView() {
    //    System.out.println("\n*** DisplayMenu() called.");
        
  //  }

  public  void displayInGameMenuView() {
     
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
            case "M" :
                this.Map();
                break;
          case "B" :
                this.Battle();
                break;  
           case "A" :
                this.MainMenu();
                break;
           case "I" :
                this.Invantory();
                break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }

    

    private void Map() {
        MapMenuView mapMenuView = new MapMenuView();
    mapMenuView.displayMapMenuView();
    }

    private void Battle() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void MainMenu() {
       MainMenuView mainMenuView = new MainMenuView();
   mainMenuView.display(); }
    
    private void Invantory() {
         System.out.println("*** startExistingGame function called ***");
    }
}
