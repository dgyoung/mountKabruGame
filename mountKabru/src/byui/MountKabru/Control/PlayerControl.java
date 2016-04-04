/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKabru.Actor;
import Classes.CIT260.MountKabru.Player;
import citbyui.cit260.mountKabru.view.ErrorView;
import byui.MountKabru.exceptions.PlayerControlExceptions;

/**
 *
 * @author Moose
 */
public class PlayerControl {

    public double spellAttack(double mana, double attack, double defence) throws PlayerControlExceptions {

        if (attack < 5 || attack > 305) {
            throw new PlayerControlExceptions("the attack is either less then 5 or greater then 305");
        }
        if (mana < 5 || mana > 305) {
            throw new PlayerControlExceptions("the attack is either less then 5 or greater then 305");
        }
        if (defence < 5 || defence > 305) {
            throw new PlayerControlExceptions("the attack is either less then 5 or greater then 305");
        }
        double spellDamage = ((attack + mana) - defence) + (Math.random() * 10);
        return spellDamage;
    }

    public static boolean strangthAttack(Player player, Actor actor, double health) throws PlayerControlExceptions {
        if (player == null){
            throw new PlayerControlExceptions("player Error");
        }
        if (actor == null){
            throw new PlayerControlExceptions("actor Error");
        }
            
        double attack = player.getAttack();
        double strangth = player.getStrength();
        double defence = actor.getDefence();


       while (health > 0 && player.getCurrentHealth() > 0 ) {
        double spellDamage = ((attack + strangth) - defence) + (Math.random() * 10);
        
        //set actors health (currnthelath - spellDamage)
        health = spellDamage - health;
        //if actors health <= 0
            //increase experance of player my actors experance value
            //call levelUp finction
            //return true
        //else call gameOver()
        
        
       }
       return true;
    }
    
    public static boolean fightWon(Actor actor, Player player ){
        return true;
    }

    public static void levelUp(Player player, String attribute) throws PlayerControlExceptions {
        double level = player.getLevel();
        double health = player.getHealth();
        double attack = player.getAttack();
        double dexterity = player.getDexterity();
        double defense = player.getDefense();
        double mana = player.getMana();
        double exp = player.getExp();
        if ((level * 2) < attack) {
            throw new PlayerControlExceptions(" currupt save ");
        }
        if ((level * 2) < dexterity) {
            throw new PlayerControlExceptions(" currupt save ");
        }
        if ((level * 2) < defense) {
            throw new PlayerControlExceptions(" currupt save ");
        }
        if ((level * 2) < mana) {
            throw new PlayerControlExceptions(" currupt save ");
        }

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
                    throw new PlayerControlExceptions(" Invalid Class ");
            }
        }
    }
}
