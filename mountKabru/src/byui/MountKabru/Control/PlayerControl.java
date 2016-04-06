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
import citbyui.cit260.mountKabru.view.ErrorView;
import byui.MountKabru.exceptions.PlayerControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moose
 */
public class PlayerControl {

    public static boolean spellAttack(Player player, BattleScene enemy) throws PlayerControlException {

        if (player == null) {
            throw new PlayerControlException("player Error");
        }
        if (enemy == null) {
            throw new PlayerControlException("actor Error");
        }

        double attack = player.getAttack();
        double strangth = player.getStrength();
        double health = enemy.getEnemyHealth();
        double defence = enemy.getEnemyDefence();

        double physicalDamage = ((attack + strangth) - defence) + (Math.random() * 10);

        //set actors health (currnthelath - spellDamage)
        enemy.setEnemyHealth(physicalDamage - health);
        //if actors health <= 0
        //increase experance of player my actors experance value
        //call levelUp finction
        //return true
        //else call gameOver()
        enemy.setDamage(physicalDamage);
        if (enemy.getEnemyHealth() <= 0) {
            PlayerControl.fightWon(enemy, player);
        } else {
            try {
                ActorsControl.Attack(player, enemy);
            } catch (ActorControlException ex) {
                Logger.getLogger(PlayerControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    public static boolean strangthAttack(Player player, BattleScene enemy) throws PlayerControlException {
        if (player == null) {
            throw new PlayerControlException("player Error");
        }
        if (enemy == null) {
            throw new PlayerControlException("actor Error");
        }

        double attack = player.getAttack();
        double strangth = player.getStrength();
        double health = enemy.getEnemyHealth();
        double defence = enemy.getEnemyDefence();

        double physicalDamage = ((attack + strangth) - defence) + (Math.random() * 10);

        //set actors health (currnthelath - spellDamage)
        enemy.setEnemyHealth(physicalDamage - health);
        //if actors health <= 0
        //increase experance of player my actors experance value
        //call levelUp finction
        //return true
        //else call gameOver()
        enemy.setDamage(physicalDamage);

        if (enemy.getEnemyHealth() <= 0) {
            PlayerControl.fightWon(enemy, player);
        } else {
            try {
                ActorsControl.Attack(player, enemy);
            } catch (ActorControlException ex) {
                Logger.getLogger(PlayerControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    public static boolean fightWon(BattleScene enemy, Player player) throws PlayerControlException {
        
        levelUp(player);
        return true;
    }

    public static void levelUp(Player player) throws PlayerControlException {
        String attribute = player.getAttribute();
        double level = player.getLevel();
        double health = player.getHealth();
        double attack = player.getAttack();
        double dexterity = player.getDexterity();
        double defense = player.getDefense();
        double mana = player.getMana();
        double exp = player.getExp();
        

        if (exp >= 10 * level * level) {
            int random;
            switch (attribute) {
                case "bard":
                    random = (int) (Math.random() * 3);
                    health = health + random + 5;
                    random = (int) (Math.random() * 3);
                    attack = attack + random + 3;
                    random = (int) (Math.random() * 3);
                    dexterity = dexterity + random + 3;
                    random = (int) (Math.random() * 3);
                    defense = defense + random + 1;
                    random = (int) (Math.random() * 3);
                    mana = mana + random + 3;
                    level = level++;
                    player.setHealth(health);
                    player.setAttack(attack);
                    player.setDexterity(dexterity);
                    player.setDefense(defense);
                    player.setMana(mana);
                    player.setLevel(level);
                    break;
                case "warrior":
                    random = (int) (Math.random() * 3);
                    health = health + random + 5;
                    random = (int) (Math.random() * 3);
                    attack = attack + random + 4;
                    random = (int) (Math.random() * 3);
                    dexterity = dexterity + random + 2;
                    random = (int) (Math.random() * 3);
                    defense = defense + random + 2;
                    random = (int) (Math.random() * 3);
                    mana = mana + random + 2;
                    level = level++;
                    player.setHealth(health);
                    player.setAttack(attack);
                    player.setDexterity(dexterity);
                    player.setDefense(defense);
                    player.setMana(mana);
                    player.setLevel(level);
                    break;
                case "mage":
                    random = (int) (Math.random() * 3);
                    health = health + random + 5;
                    random = (int) (Math.random() * 3);
                    attack = attack + random + 2;
                    random = (int) (Math.random() * 3);
                    dexterity = dexterity + random + 2;
                    random = (int) (Math.random() * 3);
                    defense = defense + random + 1;
                    random = (int) (Math.random() * 3);
                    mana = mana + random + 4;
                    level = level++;
                    player.setHealth(health);
                    player.setAttack(attack);
                    player.setDexterity(dexterity);
                    player.setDefense(defense);
                    player.setMana(mana);
                    player.setLevel(level);
                    break;
                default:
                    throw new PlayerControlException(" Invalid Class ");
            }
        }
    }
}
