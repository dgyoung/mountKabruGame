/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Actor;
import byui.MountKabru.Control.ActorsControl;
import byui.MountKabru.Control.GameControl;

/**
 *
 * @author David
 */
public class DarkForestView extends View {

    public DarkForestView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | Jungle Menu                                                           |"
                + "\n------------------------------------------------------------------------------"
                + "\nN - Look for monsters"
                + "\nG - Serch Invantory"
                + "\nS - Use potion"
                + "\nE - Seen Monsters"
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
            case "E":
                this.doAction();
                break;
            default:
                ErrorView.display("DarkForestView", "\n*** Invalid selection *** Try again");
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

    private void doAction() {
        this.console.println("\n\nEnter the file path for the file where "
                + "you want the list printed.");
        
        String filePath = this.getInput();
        
        try{
            ActorsControl.getName(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

    }

}
