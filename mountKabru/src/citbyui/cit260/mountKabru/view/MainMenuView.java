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
public class MainMenuView extends View{
    
    public MainMenuView(){

    super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | Main Menu                                                           |"
                + "\n------------------------------------------------------------------------------"
                + "\nN - Start new game"
                + "\nH - Help menu"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------------------------------");
    
    }
    // void displayMainMenuView() {
    //    this.console.println("\n*** DisplayMenu() called.");
    //  }

@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "T":
                this.testView();
                break;
            default:
                ErrorView.display("MainMenuView","\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(MountKabru.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }



    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void saveGame() {
        this.console.println("\n\n Enter the file path for file where the game"
                + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(MountKabru.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void testView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
