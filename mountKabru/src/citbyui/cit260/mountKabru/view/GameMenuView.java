/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Location;
import Classes.CIT260.MountKabru.Map;
import byui.MountKabru.Control.InGameControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n|  In Game Menu                                                     |"
                + "\n------------------------------------------------------------------------------"
                + "\nM - Map"
                + "\nB - Battle Your Foe "
                + "\nA - Main Menu"
                + "\nI - Invantory"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "M":
                this.viewMap();
                this.Map();
                break;
            case "B":
                this.Battle();
                break;
            case "A":
                this.MainMenu();
                break;
            case "I":
                this.Invantory();
                break;
            default:
                ErrorView.display("GameMenuView", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void Map() {
        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.display();
    }
    private void viewMap() {
        Location location = new Location();
        Map map = new Map();
        int level = location.getLevel();
        int stage = location.getStage();
        int noOfLevels = level;
        int noOfStages = stage;
        this.console.print("\nMount Kabru"
                + "\n       ");
        for(level = 0; level < noOfLevels; level++){
            
            for(stage = 0; stage < noOfStages; stage++){
                if(location.isExplored() == true){
                    this.console.print("---");
                    this.console.print("/\\");
                }
               else{
                    this.console.print("---");
                    this.console.print("?? ");
                }
                this.console.print("---");
            }
                this.console.print("| \n");
        }
        this.console.println(" | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
    }
    private void Battle() {
        this.console.println("*** startExistingGame function called ***");
    }

    private void MainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    private void Invantory() {
        this.console.println("*** startExistingGame function called ***");
    }
}
