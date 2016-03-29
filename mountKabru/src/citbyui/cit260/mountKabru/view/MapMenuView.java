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
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "A":
                this.GoToTown();
                break;
            case "B":
                this.GoToPlains();
                break;
            case "C":
                this.GoToDarkForest();
                break;
            case "D":
                this.GoToJungle();
                break;
            case "E":
                this.GoToHighMountin();
                break;
            default:
                ErrorView.display("MapMenuView", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void GoToTown() {
        TownMenuView townMenuView = new TownMenuView();
        townMenuView.display();
    }

    private void GoToDarkForest() {
        this.console.println("*** It's dark.  ***");
    }

    private void GoToPlains() {
        PlansMenuView plansMenuView = new PlansMenuView();
        plansMenuView.display();
    }

    private void GoToJungle() {
        JungleMenuView jungleMenuView = new JungleMenuView();
        jungleMenuView.display();
    }

    private void GoToHighMountin() {
        HighMountainMenuView highMountainMenuView = new HighMountainMenuView();
        highMountainMenuView.display();
    }
}
