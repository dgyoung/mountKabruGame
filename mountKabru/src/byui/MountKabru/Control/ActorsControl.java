/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKabru.Actor;
import Classes.CIT260.MountKabru.BattleScene;
import Classes.CIT260.MountKabru.Player;
import byui.MountKabru.exceptions.ActorControlException;
import byui.MountKabru.exceptions.PlayerControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Moose
 */
public class ActorsControl {

    public static boolean Attack(Player player, BattleScene enemy) throws ActorControlException {

        if (player == null) {
            throw new ActorControlException("player Error");
        }
        if (enemy == null) {
            throw new ActorControlException("actor Error");
        }

        double attack = enemy.getAttack();
        double health = player.getCurrentHealth();
        double defence = player.getDefense();

        while (health > 0 && player.getCurrentHealth() > 0) {
            double physicalDamage = ((attack) - defence) + (Math.random() * 10);

            //set actors health (currnthelath - spellDamage)
            player.setCurrentHealth(physicalDamage - health);
            //if actors health <= 0
            //increase experance of player my actors experance value
            //call levelUp finction
            //return true
            //else call gameOver()
            if (player.getCurrentHealth() <= 0) {
                GameControl.gameOver();
            }

        }
        return true;
    }

    public static void getName(String filePath) throws ActorControlException {
        Actor actor = null;
        try (FileOutputStream fips = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fips);

            output.writeObject(Actor.values());

        } catch (Exception e) {
            throw new ActorControlException(e.getMessage());
        }
    }
}
