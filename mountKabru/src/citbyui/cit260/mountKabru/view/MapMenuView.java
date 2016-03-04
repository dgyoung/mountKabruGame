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
public class MapMenuView extends View {

    public MapMenuView() {
        super("\n"
                + "\n--------------------------------------------------------------------------------------------------------------------------"
                + "\n|     Map Menu                                                                                                    |"
                + "\n-------------------------------------------------------------------------------------------------------------------------"
                + "\n"
                + "\n                                          ---------------------------------------------------------------------------"
                + "\n                                      (                                                                           (    )"
                + "\n                                        ----------------------------------------------------------------------------"
                + "\n                                      /                                                                          / "
                + "\n                                     /                                                                          /"
                + "\n                                    /                                                                          /"
                + "\n                                   /                                                      E                   /"
                + "\n                                 /                                                     _/i_                 /"
                + "\n                               /                                                    _/      i_             /"
                + "\n                             /     A          B           C             D        /            I_         /"
                + "\n                           /     _:                                () () () () () () () () () () i      /"
                + "\n                         /      | | |    ...............|||||||||||  |  |   |  |  |  |   |  |  | ||||||/"
                + "\n                       --------------------------------------------------------------------------------"
                + "\n                    (                                                                              (    )"
                + "\n                      ------------------------------------------------------------------------------      "
                + "\nA - Go to Town"
                + "\nB - Go to Plains"
                + "\nC - Go to Dark Forest "
                + "\nD - Go to Jungle"
                + "\nE - Go to High Mountin"
                + "\nQ - Quit"
                + "\n-----------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(char choice) {

        switch (choice) {
            case 'A':
                this.GoToTown();
                break;
            case 'B':
                this.GoToPlains();
                break;
            case 'C':
                this.GoToDarkForest();
                break;
            case 'D':
                this.GoToJungle();
                break;
            case 'E':
                this.GoToHighMountin();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void GoToTown() {
        TownMenuView townMenuView = new TownMenuView();
        townMenuView.display();
    }

    private void GoToDarkForest() {
        System.out.println("*** It's dark.  ***");
    }

    private void GoToPlains() {
        System.out.println("*** Kind of plain ***");
    }

    private void GoToJungle() {
        System.out.println("*** Too humid ***");
    }

    private void GoToHighMountin() {
        System.out.println("*** Way to much work. You go home and play Candy Land ***");
    }
}
