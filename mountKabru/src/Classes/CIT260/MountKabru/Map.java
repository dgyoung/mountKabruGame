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
   
    
    private int noOfLevels; 
    private int noOfStages;
    private Location[][] locations;
    
  

    public Map() {
    }
    
    public Map(int noOfLevels, int noOfStages) {
    
        if (noOfLevels < 1 || noOfStages <1) {
            System.out.println("the number of levels and stages must be > zero");
            return;
        }
        this.noOfLevels = noOfLevels;
        this.noOfStages = noOfStages;
        
        // creats 2-D array for location objects
        this.locations = new Location [noOfLevels][noOfStages];
        
        for (int level = 0; level < noOfLevels; level++) {
             for (int stage = 0; stage < noOfStages; stage++){
// creat and initialize object instance
            Location location = new Location();
            location.setStage(stage);
            location.setLevel(level);
            
            
            // assign the location object to the current position in array
            locations[level][stage] = location;
        }
    }
    }
    public int getLevelCount() {
        return noOfLevels;
    }

    public void setLevelCount(int levelCount) {
        this.noOfLevels = levelCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
                
    public int getStageCount() {
        return noOfStages;
    }

    public void setStageCount(int stageCount) {
        this.noOfStages = stageCount;
    }

    @Override
    public String toString() {
        return "Map{" + "levelCount=" + noOfLevels + ", stageCount=" + noOfStages + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.noOfLevels;
        hash = 59 * hash + this.noOfStages;
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
        if (this.noOfLevels != other.noOfLevels) {
            return false;
        }
         if(this.noOfStages != other.noOfStages) {
            return false;
        }
        return true;
    }

          
}
