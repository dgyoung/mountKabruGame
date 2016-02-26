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
 * @author Moose
 */
public class TavernKeepMenuView
{
    private String menu;
    public TavernKeepMenuView() {
        this.menu = "\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n | Tha tavern keep looks at with one eyebrow rased.                                       |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nA - Talk to the Tavern Keep"
                        +"\n-------------------------------------------------------------------------------";
    }
        
    
  // void displayTavernKeepMenuView() {
    //    System.out.println("\n*** DisplayMenu() called.");
        
  //  }

  public  void displayTavernKeepMenuView() {
     
      boolean done = false; // set flage to not done
      do {
          int i = 0;
          
          // prompt for and get players name
          do{
            
          String menuOption = this.getMenuOption();    
          if (menuOption.toUpperCase().equals("A")){ // user wants to quit
              double random = Math.random();
              if (random <= .25){
                  System.out.println("If you look under all the chairs you might find some Gold.");
              
              return;
              
              }
           else {
              System.out.println("Stop bugging me kid, or I'll kick you out my self.");
          }
          }
          done = this.doAction(menuOption);
          i++;
          } while (i < 6);
          System.out.println("You Win");
          return;
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
               break;
             default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }





} 
