/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKabru;

import java.io.Serializable;

/**
 *
 * @author Moose
 */
public class Map implements Serializable{
   
    // Map instance veriables 
    private int levelCount; 
    private int stageCount;
    private Location[][] locations;
    
    public Map() {
    }
    
    public Map(int levelCount, int stageCount) {
        if (levelCount < 1 || stageCount < 1){
            System.out.println("The number of rows and colums must be > zero");
            return;
        }
        this.levelCount = levelCount;
        this.stageCount = stageCount;
        
        this.locations = new Location[levelCount][stageCount];
        
        for (int row = 0; row < levelCount; row++){
            for(int column = 0; column < stageCount; column++){
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                
                locations[row][column] = location;
            }
        }

    }

    
  
    public int getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(int levelCount) {
        this.levelCount = levelCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
                
    public int getStageCount() {
        return stageCount;
    }

    public void setStageCount(int stageCount) {
        this.stageCount = stageCount;
    }

    @Override
    public String toString() {
        return "Map{" + "levelCount=" + levelCount + ", stageCount=" + stageCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.levelCount;
        hash = 59 * hash + this.stageCount;
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
        final Map other = (Map) obj;
        if (this.levelCount != other.levelCount) {
            return false;
        }
         if(this.stageCount != other.stageCount) {
            return false;
        }
        return true;
    }

          
}
