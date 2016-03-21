/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Location;
import Classes.CIT260.MountKabru.Map;
import byui.MountKabru.Control.InvatoryControl;
import java.util.Arrays;

/**
 *
 * @author Moose
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | Game Menu                                                           |"
                + "\n------------------------------------------------------------------------------"
                + "\nH - Help"
                + "\nI - Invatory List"
                + "\nV - View Map"
                + "\nE - Explore"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------------------------------");

    }

    @Override
    public boolean doAction(char choice) {

        switch (choice) {
            case 'H':
                this.help();
                break;
            case 'I':
                this.invatoryList();
                break;
            case 'V':
                this.viewMap();
                break;
            case 'E':
                this.explore();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void help() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void invatoryList() {
        InvintoryView invintoryView = new InvintoryView();
        invintoryView.display();
    }

    private void viewMap() {
        Location location = new Location();
        Map map = new Map();
        int level = location.getLevel();
        int stage = location.getStage();
        int noOfLevels = 4;
        int noOfStages = 6;
        System.out.print("\nMount Kabru"
                + "\n       ");
        for(level = 0; level < noOfLevels; level++)
            
            for(stage = 0; stage < noOfStages; stage++){
                if(location.isExplored() == true){
                    System.out.print("!! ");
                }
                else{
                    System.out.print("?? ");
                }
            }
        System.out.print("\r\n*    ");
        }
        
    

    private void explore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
