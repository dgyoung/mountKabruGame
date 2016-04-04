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
 * @author David
 */
public class BattleScene implements Serializable {

    private String actor;
    private String reward;
    private String attribute;
    private double enemyHealth;
    private double enemyDefence;
    private double enemyAttack;
    private boolean alive;
    private double damage;

    public BattleScene() {
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public double getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(double enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public double getEnemyDefence() {
        return enemyDefence;
    }

    public void setEnemyDefence(double enemyDefence) {
        this.enemyDefence = enemyDefence;
    }

    public double getAttack() {
        return enemyAttack;
    }

    public void setAttack(double attack) {
        this.enemyAttack = attack;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public double getEnemyAttack() {
        return enemyAttack;
    }

    public void setEnemyAttack(double enemyAttack) {
        this.enemyAttack = enemyAttack;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "BattleScene{" + "actor=" + actor + ", reward=" + reward + ", attribute=" + attribute + ", enemyHealth=" + enemyHealth + ", enemyDefence=" + enemyDefence + ", enemyAttack=" + enemyAttack + ", alive=" + alive + ", damage=" + damage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.actor);
        hash = 97 * hash + Objects.hashCode(this.reward);
        hash = 97 * hash + Objects.hashCode(this.attribute);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.enemyHealth) ^ (Double.doubleToLongBits(this.enemyHealth) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.enemyDefence) ^ (Double.doubleToLongBits(this.enemyDefence) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.enemyAttack) ^ (Double.doubleToLongBits(this.enemyAttack) >>> 32));
        hash = 97 * hash + (this.alive ? 1 : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.damage) ^ (Double.doubleToLongBits(this.damage) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BattleScene other = (BattleScene) obj;
        if (!Objects.equals(this.actor, other.actor)) {
            return false;
        }
        if (!Objects.equals(this.reward, other.reward)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        if (Double.doubleToLongBits(this.enemyHealth) != Double.doubleToLongBits(other.enemyHealth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.enemyDefence) != Double.doubleToLongBits(other.enemyDefence)) {
            return false;
        }
        if (Double.doubleToLongBits(this.enemyAttack) != Double.doubleToLongBits(other.enemyAttack)) {
            return false;
        }
        if (this.alive != other.alive) {
            return false;
        }
        if (Double.doubleToLongBits(this.damage) != Double.doubleToLongBits(other.damage)) {
            return false;
        }
        return true;
    }

}
