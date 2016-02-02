/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import java.util.Objects;

/**
 *
 * @author Moose
 */
public class Actors {
    private int helth;
    private int attack;
    private String name;
    private int level;
    private int defence;
    private String spell;
    private String invintory;
    private String weekness; 

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

    
    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getInvintory() {
        return invintory;
    }

    public void setInvintory(String invintory) {
        this.invintory = invintory;
    }

    public String getWeekness() {
        return weekness;
    }

    public void setWeekness(String weekness) {
        this.weekness = weekness;
    }

    @Override
    public String toString() {
        return "Actors{" + "helth=" + helth + ", attack=" + attack + ", name=" + name + ", level=" + level + ", defence=" + defence + ", spell=" + spell + ", invintory=" + invintory + ", weekness=" + weekness + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.helth;
        hash = 61 * hash + this.attack;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + this.level;
        hash = 61 * hash + this.defence;
        hash = 61 * hash + Objects.hashCode(this.spell);
        hash = 61 * hash + Objects.hashCode(this.invintory);
        hash = 61 * hash + Objects.hashCode(this.weekness);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actors other = (Actors) obj;
        if (this.helth != other.helth) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        if (this.defence != other.defence) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.spell, other.spell)) {
            return false;
        }
        if (!Objects.equals(this.invintory, other.invintory)) {
            return false;
        }
        if (!Objects.equals(this.weekness, other.weekness)) {
            return false;
        }
        return true;
    }
    
    
}
