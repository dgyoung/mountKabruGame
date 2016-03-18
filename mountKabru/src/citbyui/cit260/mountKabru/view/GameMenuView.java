/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.InvatoryControl;

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
        
    }

    private void explore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
