/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKabru.Map;
import Classes.CIT260.MountKabru.Scene;

/**
 *
 * @author Moose
 */
public class MapControl {
    static ArrayList <Location>createLocation(){
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    public static Map createMap() {
    // create the map
Map map = new Map (5, 10);

// create a list of the different scenes in the game
Scene[] scenes = createScenes();

// assigne the different scenes to locations in the map
assignScenesToLocations(map, scenes);


return map;
    }
    static void moveActorsToStartingLocation(Map map) {
        
    }
    private static void assignScenesToLocations(Map map,Scene[] scenes){
        
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
