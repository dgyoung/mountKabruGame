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
public enum Scene implements Serializable{
  
    Hightmountin("HighMountin", "BossFight", "FightEvent"),
    Jungle,
    DarkForest,
    Plans,
    Tavern,
    BlackSmith;
    
    private String description;
    private String name;
    private String eventType;
    
    
  Scene(String name, String description, String eventType ) {
   
  this.name = name;
  this.description = description;
  this.eventType = eventType;
  }
    
  
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
    
    public String getEventType() {
             return eventType;
    }

    public void seteventType(String eventType) {
        this.eventType = eventType;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + '}';
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
}
