/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.TavernControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class TavernMenuView extends View {

    public TavernMenuView() {
        super("\n"
                + "\n-------------------------------------------------------------------------------------------------------------------------"
                + "\n|     Tavern Menu                                                                                                   |"
                + "\n-------------------------------------------------------------------------------------------------------------------------"
                + "\nA - Talk to Tavern Keep"
                + "\nB - Rest"
                + "\nC - Buy Stuff"
                + "\nQ - Leave Tavern"
                + "\n-----------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        switch (choice) {
            case "A":
                this.TalkToTavernKeep();
                break;
            case "B":
                this.Rest();
                break;
            case "C":
                this.BuyStuff();
                break;
            default:
               ErrorView.display("StartProgramView","\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void TalkToTavernKeep() {
        TavernKeepMenuView tavernKeepMenuView = new TavernKeepMenuView();
        tavernKeepMenuView.display();
    }

    private void Rest() {
        this.console.println("*** You rest and are lazy. Get back to work ***");
    }

    private void BuyStuff() {
        this.console.println("*** You buy an overpriced piece of junk. You are a fool. ***");
    }

}
