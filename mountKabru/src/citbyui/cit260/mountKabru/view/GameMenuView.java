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
import mountkabru.MountKabru;

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
          //Show the player the map
         Location[][] locations = MountKabru.getCurrentGame().getMap().getLocations();
         int rowCount = MountKabru.getCurrentGame().getMap().getStageCount();
         int columnCount = MountKabru.getCurrentGame().getMap().getLevelCount();
         
         
         System.out.println("This is the map");
         
         
        for (int row = rowCount-1; row >= 0; row--) {
            
            System.out.print(" " + (row+1) + " ");
            for (int column = 0; column < columnCount; column++) {
                System.out.print("|");
                Location location = locations[row][column];
                boolean discovered = location.isDiscovered(); 
                if (discovered == true) {
                 System.out.print("---");
                 System.out.print("/\\");
                }
                else {
                 System.out.print("---");   
                 System.out.print("??");
                }
                System.out.print("---");
            }
        System.out.print("| \n");
        }
                
       System.out.println("   |   1    |   2    |   3    |   4    |   5    |   6    |   7    |   8    |"); 
         
       MapMenuView adventureView = new MapMenuView();
       adventureView.display();
    }
    

    private void explore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
