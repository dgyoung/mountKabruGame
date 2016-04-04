/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import java.io.Serializable;
import java.util.Objects;
//add an aray list of items

/**
 *
 * @author David
 */
public class Player implements Serializable {

    private String name;
    private String attribute;
    private String inventory;
    private double strength;
    private double dexterity;
    private double mana;
    private double health;
    private double currentHealth;
    private String spell;
    private double defense;
    private double level;
    private double attack;
    private Location location;
    private double exp;

    
    public Player() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getDexterity() {
        return dexterity;
    }

    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", attribute=" + attribute + ", inventory=" + inventory + ", strength=" + strength + ", dexterity=" + dexterity + ", mana=" + mana + ", health=" + health + ", currentHealth=" + currentHealth + ", spell=" + spell + ", defense=" + defense + ", level=" + level + ", attack=" + attack + ", location=" + location + ", exp=" + exp + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.attribute);
        hash = 19 * hash + Objects.hashCode(this.inventory);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.dexterity) ^ (Double.doubleToLongBits(this.dexterity) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.mana) ^ (Double.doubleToLongBits(this.mana) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.currentHealth) ^ (Double.doubleToLongBits(this.currentHealth) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.spell);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.defense) ^ (Double.doubleToLongBits(this.defense) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.level) ^ (Double.doubleToLongBits(this.level) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.location);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.exp) ^ (Double.doubleToLongBits(this.exp) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dexterity) != Double.doubleToLongBits(other.dexterity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mana) != Double.doubleToLongBits(other.mana)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentHealth) != Double.doubleToLongBits(other.currentHealth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defense) != Double.doubleToLongBits(other.defense)) {
            return false;
        }
        if (Double.doubleToLongBits(this.level) != Double.doubleToLongBits(other.level)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attack) != Double.doubleToLongBits(other.attack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.exp) != Double.doubleToLongBits(other.exp)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.spell, other.spell)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    

    

    
    

}
