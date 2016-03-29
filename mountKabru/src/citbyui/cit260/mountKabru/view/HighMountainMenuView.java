/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

/**
 *
 * @author Moose
 */
public class HighMountainMenuView extends View {

    public HighMountainMenuView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | High Mountain Menu                                                           |"
                + "\n------------------------------------------------------------------------------"
                + "\nN - Look for monsters"
                + "\nG - Serch Invantory"
                + "\nS - Use potion"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
        switch (choice) {
            case "N":
                this.LookForMonsters();
                break;
            case "G":
                this.SerchInvantory();
                break;
            case "S":
                this.UsePotion();
                break;
            default:
                ErrorView.display("HighMountianMenuView", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void LookForMonsters() {
        BattleMenuView battleMenuView = new BattleMenuView();
        battleMenuView.display();
    }

    private void SerchInvantory() {
        this.console.println("*** you for got your bag, you have nothing ***");
    }

    private void UsePotion() {
        this.console.println("*** you have no potions ***");
    }

}
