/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Moose
 */
public enum Actors implements Serializable {
    
    LargeSpider("Kill it, kill it with fire."),
    GiantRat("Rodents of unusual size?"),
    MeanDog("I hate mean dogs."),
    Snake("Sssssssave yourssssssssselvessss From itsssss poisssson. "),
    SwarmOfCentipedes("Kind of makes your skin crawl."),
    Bandit("Give me your money!"),
    OldMan("Get of my lawn!"),
    Wolf("I hope its just the one."),
    AngryDear("Why is it so angry?"),
    SwampHagg("Want to see my ginger bread house?"),
    SwarmOfSquirrels("This is nuts!"),
    Boar("Hakuna matata"),
    RabidBoa("It's foaming at the fangs"),
    Tiger("All we need now is a bar and a lion....o my."),
    SwarmOfMonkys("This is bananas!"),
    FeralJungleBoy("You tell him Put some pants on you hippy."),
    Bear("Just the bear necessities"),
    TrollWithLeprosy("He seams to be falling apart"),
    MysteriousMaster("You can always just quit the game."),
    Dragon("I hope you have dwarf to feed it."),
    RockGolem("You shall name him Rocky and he shall be yours."),
    Roc("Thats a big bird."),
    Giant("You have seen bigger."),
    SwarmOfKobolds("May be thay might think your a god and not kill you");
    
    private final int helth;
    private final int attack;
    
    private final int level;
    private final int defence;
    private final String spell;
    private final String invintory;
    private final String weekness; 

    public Actors(int helth, int attack, String name, int level, int defence, String spell, String invintory, String weekness) {
        this.helth = helth;
        this.attack = attack;
        this.name = name;
        this.level = level;
        this.defence = defence;
        this.spell = spell;
        this.invintory = invintory;
        this.weekness = weekness;
    }

    public Actors(String description) {
this.description = description;
coordinates = new Point (1,1);
    }

    
    public int getHelth() {
        return helth;
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
        return "Actors{" + "helth=" + helth + ", attack=" + attack + ", name=" + name + ", level=" + level + ", defence=" + defence + ", spell=" + spell + ", invintory=" + invintory + ", weekness=" + weekness + '}';
    }

    
    
    
}
