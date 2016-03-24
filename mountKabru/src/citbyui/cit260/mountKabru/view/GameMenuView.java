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
public class GameMenuView extends View{
    public GameMenuView() {
        super("\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n|  In Game Menu                                                     |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nM - Map"
                        +"\nB - Battle Your Foe "
                        +"\nA - Main Menu"
                        + "\nI - Invantory"
                        +"\nQ - Quit"
                        +"\n-------------------------------------------------------------------------------");
    }
@Override
    public boolean doAction(char choice) 
    {
                 
        switch (choice) {
            case 'M' :
                this.Map();
                break;
          case 'B' :
                this.Battle();
                break;  
           case 'A' :
                this.MainMenu();
                break;
           case 'I' :
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
    mapMenuView.display();
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
