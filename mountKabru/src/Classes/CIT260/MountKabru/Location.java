/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Location implements Serializable{
    private int level;
    private int stage;


    public Location() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.level) ^ (Double.doubleToLongBits(this.level) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.stage) ^ (Double.doubleToLongBits(this.stage) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "level=" + level + ", stage=" + stage + '}';
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.level) != Double.doubleToLongBits(other.level)) {
            return false;
        }
        if (Double.doubleToLongBits(this.stage) != Double.doubleToLongBits(other.stage)) {
            return false;
        }
        return true;
    }
    
    
}
