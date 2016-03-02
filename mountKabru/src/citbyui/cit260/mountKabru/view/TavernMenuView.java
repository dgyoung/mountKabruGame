/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.TavernControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class TavernMenuView
{
    private String menu;
    public TavernMenuView() {
        this.menu = "\n"
                        + "\n-------------------------------------------------------------------------------------------------------------------------"        
                        + "\n|     Tavern Menu                                                                                                   |"
                        + "\n-------------------------------------------------------------------------------------------------------------------------"
                        +"\nA - Talk to Tavern Keep"
                        +"\nB - Rest"
                        +"\nC - Buy Stuff"
                        +"\nQ - Leave Tavern"
                        +"\n-----------------------------------------------------------------------------------------------------------------------------";
    }
        
    
  // void displayTavernMenuView() {
    //    System.out.println("\n*** DisplayMenu() called.");
        
  //  }

  public  void displayTavernMenuView() {
     
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
                this.TalkToTavernKeep();
                break;
          case "B" :
                this.Rest();
                break;  
           case "C" :
                this.BuyStuff();
                break;  
                default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }

    

    private void TalkToTavernKeep() {
            TavernKeepMenuView tavernKeepMenuView = new TavernKeepMenuView();
   tavernKeepMenuView.displayTavernKeepMenuView();
    }
    private void Rest() {
       System.out.println("*** You rest and are lazy. Get back to work ***");
    }
    private void BuyStuff() {
         System.out.println("*** You buy an overpriced piece of junk. You are a fool. ***");
    }

    
} 
