/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.GameControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author David
 */
public class MainMenuView
{
    private String menu;
    public MainMenuView() {
        this.menu = "\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n | Main Menu                                                           |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nN - Start new game"
                        +"\nG - Get and start saved game"
                        +"\nS - Save game"
                        +"\nQ - Quit"
                        +"\n-------------------------------------------------------------------------------";
    }
        
    
  // void displayMainMenuView() {
    //    System.out.println("\n*** DisplayMenu() called.");
        
  //  }

  public  void displayMainMenuView() {
     
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
                this.startNewGame();
                break;
          case "G" :
                this.startExistingGame();
                break;  
           case "H" :
                this.displayHelpMenu();
                break;     
          case "S" :
                this.saveGame();
                break;      
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(MountKabru.getPlayer());
        
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
       System.out.println("*** displayHelpMenu function called ***");
    }
} 
