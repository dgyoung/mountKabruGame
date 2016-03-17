/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import java.io.Serializable;
import java.awt.Point;
/**
 *
 * @author David
 */
public class Location implements Serializable{
    
      
    private int level;
    private int stage;
    private String name;
    private Scene[] scene;
    private boolean explored;

    public Location( ){
        
    }
    public Location(int level, int stage, String name, Scene[] scene, boolean explored) {
        this.level = level;
        this.stage = stage;
        this.name = name;
        this.scene = scene;
        this.explored = explored;
    }

    public Scene[] getScene() {
        return scene;
    }

    public void setScene(Scene[] scene) {
        this.scene = scene;
    }

    public boolean isExplored() {
        return explored;
    }

    public void setExplored(boolean explored) {
        this.explored = explored;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
