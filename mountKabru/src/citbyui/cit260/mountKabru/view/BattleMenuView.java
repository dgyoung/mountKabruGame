/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Actor;
import Classes.CIT260.MountKabru.BattleScene;
import Classes.CIT260.MountKabru.Player;
import Classes.CIT260.MountKapru.exceptions.AttackControlException;
import byui.MountKabru.Control.ActorsControl;
import byui.MountKabru.Control.HelpControl;
import byui.MountKabru.Control.PlayerControl;
import byui.MountKabru.exceptions.ActorControlException;
import byui.MountKabru.exceptions.PlayerControlException;
import java.util.Random;
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
        Player player = MountKabru.getPlayer();
        BattleScene enemy = new BattleScene();
        try {
            boolean result = PlayerControl.strangthAttack(player, enemy);
        } catch (PlayerControlException me) {
            this.console.println(me.getMessage());
        }
    }

    private void spellAttack() {
        Player player = MountKabru.getPlayer();
        BattleScene enemy = new BattleScene();
        try {
            boolean result = PlayerControl.spellAttack(player, enemy);
        } catch (PlayerControlException me) {
            this.console.println(me.getMessage());
        }
        this.console.println("You dealt " + enemy.getDamage() + " damage.");
    }

    private void openInvatory() {
        this.console.println("\nopen invatory");
    }

}
