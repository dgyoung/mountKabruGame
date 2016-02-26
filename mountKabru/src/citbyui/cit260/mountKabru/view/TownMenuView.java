/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.MapControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class TownMenuView
{
    private String menu;
    public TownMenuView() {
        this.menu = "\n"
                        + "\n-------------------------------------------------------------------------------------------------------------------------"        
                        + "\n|     Town Menu                                                                                                   |"
                        + "\n-------------------------------------------------------------------------------------------------------------------------"
                        +"\nA - Go to Tavern"
                        +"\nB - Go to Black Smith"
                        +"\nC - Go to Pit "
                        +"\nQ - Leave Town"
                        +"\n-----------------------------------------------------------------------------------------------------------------------------";
    }
        
    
  // void displayMapMenuView() {
    //    System.out.println("\n*** DisplayMenu() called.");
        
  //  }

  public  void displayTownMenuView() {
     
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
            case "A" :
                this.GoToTavern();
                break;
          case "B" :
                this.GoToBlackSmith();
                break;  
           case "C" :
                this.GoToPit();
                break;  
                case "D" :
              default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }

    

    private void GoToTavern() {
        System.out.println("*** Sorry We R Closed ***");
    }
    private void GoToBlackSmith() {
       System.out.println("*** Get lost we are closed! ***");
    }
    private void GoToPit() {
         System.out.println("*** Sorry we are closed go die in the woods. ***");
    }

    
} 
