/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import byui.MountKabru.exceptions.ActorControlException;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Moose
 */
public enum Actor implements Serializable {

    LargeSpider(5, 2, "LargeSpider", 1, 2, "Spell", "Empty", "Fire", "Kill it. kill it with fire", new Point(0, 0)),
    GiantRat(5, 3, "GiantRat", 1, 1, "Spell", "Empty", "Fire", "Rodents of unusual size?", new Point(0, 0)),
    MeanDog(4, 4, "MeanDog", 1, 1, "Spell", "Empty", "Stick", "I hate mean dogs.", new Point(0, 0)),
    Snake(5, 2, "Snake", 1, 2, "Spell", "Empty", "Fire", "Sssssssave yourssssssssselvessss From itsssss poisssson.", new Point(0, 0)),
    SwarmOfCentipedes(5, 2, "SwarmOfCentipedes", 1, 2, "Spell", "Empty", "Fire", "Kind of makes your skin crawl.", new Point(0, 0)),
    Bandit(5, 5, "Bandit", 1, 3, "Spell", "Empty", "Fire", "Give me your money!", new Point(0, 0)),
    OldMan(5, 2, "OldMan", 2, 2, "Spell", "Empty", "Fire", "Get of my lawn!", new Point(0, 0)),
    Wolf(5, 2, " Wolf", 2, 2, "Spell", "Empty", "Fire", "I hope its just the one.", new Point(0, 0)),
    AngryDear(5, 2, " AngryDear", 2, 2, "Spell", "Empty", "Fire", "Why is it so angry?", new Point(0, 0)),
    SwampHagg(5, 2, " SwampHagg", 2, 2, "Spell", "Empty", "Fire", "Want to see my ginger bread house?", new Point(0, 0)),
    SwarmOfSquirrels(5, 2, "SwarmOfSquirrels", 2, 2, "Spell", "Empty", "Fire", "This is nuts!", new Point(0, 0)),
    Boar(5, 2, "Boar", 2, 2, "Spell", "Empty", "Fire", "Hakuna matata", new Point(0, 0)),
    RabidBoa(5, 2, "RabidBoa", 3, 2, "Spell", "Empty", "Fire", "It's foaming at the fangs", new Point(0, 0)),
    Tiger(5, 2, "Tiger", 3, 2, "Spell", "Empty", "Fire", "All we need now is a bar and a lion....o my.", new Point(0, 0)),
    SwarmOfMonkys(5, 2, "SwarmOfMonkys", 3, 2, "Spell", "Empty", "Fire", "This is bananas!", new Point(0, 0)),
    FeralJungleBoy(5, 2, " FeralJungleBoy", 3, 2, "Spell", "Empty", "Fire", "You tell him Put some pants on you hippy.", new Point(0, 0)),
    Bear(5, 2, " Bear", 3, 2, "Spell", "Empty", "Fire", "Just the bear necessities", new Point(0, 0)),
    TrollWithLeprosy(5, 2, "TrollWithLeprosy", 3, 2, "Spell", "Empty", "Fire", "He seams to be falling apart", new Point(0, 0)),
    MysteriousMaster(5, 2, "MysteriousMaster", 4, 2, "Spell", "Empty", "Fire", "You can always just quit the game.", new Point(0, 0)),
    Dragon(5, 2, "Dragon", 4, 2, "Spell", "Empty", "Fire", "I hope you have dwarf to feed it.", new Point(0, 0)),
    RockGolem(5, 2, "RockGolem", 4, 2, "Spell", "Empty", "Fire", "You shall name him Rocky and he shall be yours.", new Point(0, 0)),
    Roc(5, 2, "Roc", 4, 2, "Spell", "Empty", "Fire", "Thats a big bird.", new Point(0, 0)),
    Giant(5, 2, " Giant", 4, 2, "Spell", "Empty", "Fire", "You have seen bigger.", new Point(0, 0)),
    SwarmOfKobolds(5, 2, "SwarmOfKobolds", 4, 2, "Spell", "Empty", "Fire", "May be thay might think your a god and not kill you", new Point(0, 0));

    private final int health;
    private final int attack;
    private final int level;
    private final int defence;
    private final String spell;
    private final String invintory;
    private final String weekness;
    private final String name;
    private final String enamyDiscription;
    private final Point location;

    Actor(int health, int attack, String name, int level, int defence, String spell, String invintory, String weekness, String enamyDiscription, Point location) {

        this.enamyDiscription = enamyDiscription;
        this.health = health;
        this.attack = attack;
        this.name = name;
        this.level = level;
        this.defence = defence;
        this.spell = spell;
        this.invintory = invintory;
        this.weekness = weekness;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Point getLocation() {
        return location;
    }

    public int getHealth() {
        return health;
    }

    public String getenamyDiscription() {
        return enamyDiscription;
    }

    public int getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    public int getDefence() {
        return defence;
    }

    public String getSpell() {
        return spell;
    }

    public String getInvintory() {
        return invintory;
    }

    public String getWeekness() {
        return weekness;
    }
    


    @Override
    public String toString() {
        return "Actors{" + "health=" + health + ", attack=" + attack + ", name=" + name + ", level=" + level + ", defence=" + defence + ", spell=" + spell + ", invintory=" + invintory + ", weekness=" + weekness + '}';
    }

}
