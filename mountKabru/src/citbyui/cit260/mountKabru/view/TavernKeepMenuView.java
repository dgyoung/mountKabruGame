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
public class TavernKeepMenuView extends View {

    public TavernKeepMenuView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | The tavern keep looks at you with one eyebrow raised.                                       |"
                + "\n------------------------------------------------------------------------------"
                + "\nA - Talk to the Tavern Keep"
                + "\n-------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "A":
                break;
            default:
                ErrorView.display("StartProgramView", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

}
