/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Actor;
import Classes.CIT260.MountKabru.Player;
import Classes.CIT260.MountKapru.exceptions.AttackControlException;
import byui.MountKabru.Control.ActorsControl;
import byui.MountKabru.Control.HelpControl;
import byui.MountKabru.exceptions.ActorControlException;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author David
 */
public class BattleMenuView extends View {

    public BattleMenuView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | You are in a fight! What will you do?                                       |"
                + "\n------------------------------------------------------------------------------"
                + "\nA - Attack"
                + "\nS - Spell Attack"
                + "\nI - Open Inventory"
                + "\nR - Run"
                + "\n-------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
        switch (choice) {
            case "A":
                this.attack();
                break;
            case "S":
                this.spellAttack();
                break;
            case "I":
                this.openInvatory();
                break;
            case "R":
                break;
            default:
                ErrorView.display("BattleMenuView", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void attack() {
        this.console.println("MeleeAttack");
        double strength = -20.0;
        double attack = 25.0;
        double defence = 15.0;
        try {
            double result = ActorsControl.strengthAttack(strength, attack, defence);
        } catch (ActorControlException me) {
            this.console.println(me.getMessage());
        }
    }

    private void spellAttack() {
        this.console.println("SpellAttack");
        double mana = 20.0;
        double attack = 25.0;
        double defence = 815.0;
        double result = 0;
        try {
            result = ActorsControl.spellAttack(mana, attack, defence);
        } catch (ActorControlException me) {
            this.console.println(me.getMessage());
        }
    }

    private void openInvatory() {
        this.console.println("\nopen invatory");
    }

}
