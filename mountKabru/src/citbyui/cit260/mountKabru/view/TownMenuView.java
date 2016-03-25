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
public class TownMenuView extends View {

    public TownMenuView() {
        super("\n"
                + "\n-------------------------------------------------------------------------------------------------------------------------"
                + "\n|     Town Menu                                                                                                   |"
                + "\n-------------------------------------------------------------------------------------------------------------------------"
                + "\nA - Go to Tavern"
                + "\nB - Go to Black Smith"
                + "\nC - Go to Pit "
                + "\nQ - Leave Town"
                + "\nD - Dapper Dan"
                + "\n-----------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        switch (choice) {
            case "A":
                this.GoToTavern();
                break;
            case "B":
                this.GoToBlackSmith();
                break;
            case "C":
                this.GoToPit();
                break;
            case "D":
                this.GoToDapperDan();
            default:
                ErrorView.display("StartProgramView","\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void GoToTavern() {
        TavernMenuView tavernMenuView = new TavernMenuView();
        tavernMenuView.display();
    }

    private void GoToBlackSmith() {
        this.console.println("*** Get lost! We are closed! ***");
    }

    private void GoToPit() {
        this.console.println("*** Sorry we are closed. Go die in the woods. ***");
    }

    private void GoToDapperDan() {
        GameTipsView gameTipsView = new GameTipsView();
        gameTipsView.display();
        
    }
}
