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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | Help Menu                                                           |"
                + "\n------------------------------------------------------------------------------"
                + "\nN - How to move"
                + "\nG - About the game"
                + "\nS - How to fight"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
        switch (choice) {
            case "N":
                this.howToMove();
                break;
            case "G":
                this.aboutTheGame();
                break;
            case "S":
                this.howToFight();
                break;
            default:
                ErrorView.display("HelpMenuView", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void howToMove() {
        this.console.println("*** Your move  ***");
    }

    private void aboutTheGame() {
        this.console.println("*** It's a game ***");
    }

    private void howToFight() {
        this.console.println("*** Why you asking me? You sissy ***");
    }

}
