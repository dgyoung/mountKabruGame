/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Player;
import byui.MountKabru.Control.GameControl;
import byui.MountKabru.exceptions.GameControlException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class StartProgramView extends View {

    private String promptMessage;

    public StartProgramView() {
        super("\n******************************************************"
                + "\n*                                                    *"
                + "\n* Welcome to Mount Kabru                             *"
                + "\n* In this game you will be an adventurer who will    *"
                + "\n* battle monsters and bandits in the hopes to face   *"
                + "\n* the great master.                                  *"
                + "\n*                                                    *"
                + "\n* You have a long journey ahead of you and have a lot *"
                + "\n* to learn. As you fight monsters you will grow in   *"
                + "\n* strength and power in hopes that one day you may    *"
                + "\n* prove your worth.                                  *"
                + "\n*                                                    *"
                + "\n* May good fortune follow you on your quest.          *"
                + "\n*                                                    *"
                + "\n******************************************************"
                + "\n"
                + "\n What is your name player?"
        );
    }

    private String year = "\n"
            + "\n"
            + "\n I forgot, what year is it?";

    @Override
    public boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            ErrorView.display("StartProgramView", "\nInvalid players name: "
                    + "the name must be greater than one character in length");
            return false;
        }

        // ask what year is it
        this.displayMessage = this.year;
        String year = this.getInput().toUpperCase();
        int currentYear = 0;

        try {
            currentYear = parseInt(year);
        } catch (NumberFormatException nf) {
            ErrorView.display("StartProgramView", "You entered the wrong number");
        }

        this.console.println(currentYear + " is really the current year!!");

        Player player = null;

        try {
            player = GameControl.createPlayer(playersName);
        } catch (GameControlException me) {
            this.console.println(me.getMessage());
        }
        if (player == null) {
            ErrorView.display("StartProgramView", "\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;

    }

    private void displayNextView(Player player) {

        // display a custom welcome message
        this.console.println("\n==================================="
                + "\n Welcometo the game " + player.getName()
                + "\n We Hope you have a lot of fun!"
                + "\n=================================="
        );
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

    }
}
