/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKabru.Location;
import Classes.CIT260.MountKabru.Map;
import Classes.CIT260.MountKabru.Scene;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class MapControl {

    public static Map createMap() {
        // create the map
        Map map = new Map(4, 8);

// create a list of the different scenes in the game
        Scene[] scenes = createScenes();

// assigne the different scenes to locations in the map
        assignScenesToLocations(map, scenes);


return map;
 }
    private static void assignScenesToLocations(Map map,Scene[] scenes){
    int noOfLevels = map.getNoOfLevels();
    int noOfStages = map.getNoOfStages();
    Location[][] locations = map.getLocations();
    
     for (int level = 0; level < noOfLevels; level++) {
             for (int stage = 0; stage < noOfStages; stage++){
                locations [level][stage].setScene(scenes);
                
           }
     }  
          
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[9]; 
        
      Scene townScene = new Scene("town", "town", "you return to Town!", "you look around for a shop");
      scenes[0] = townScene;
     
     Scene plainsGoldScene = new Scene("Gold", "plains", "you found gold", "you found the mother load!");
      scenes[1] = plainsGoldScene;
      
      Scene plainsMonsterScene = new Scene("Monster", "plains", "you found a Monster!", "prepare for battle!");
      scenes[2] = plainsMonsterScene;
      
      Scene jungleGoldScene = new Scene("Gold", "Jungle", "you found gold", "you found the mother load!");
      scenes[3] = jungleGoldScene;
      
      Scene jungleMonsterScene = new Scene("Monster", "Jungle", "you found a Monster!", "prepare for battle!");
      scenes[4] = jungleMonsterScene;
      
      Scene darkForestGoldScene = new Scene("Gold", "DarkForest", "you found gold", "you found the mother load!");
      scenes[5] = darkForestGoldScene;
      
      Scene darkForestMonsterScene = new Scene("Monster", "DarkForest", "you found a Monster!", "prepare for battle!");
      scenes[6] = darkForestMonsterScene;
      
      Scene hightMountainGoldScene = new Scene("Gold", "highMountain", "you found gold", "you found the mother load!");
      scenes[7] = hightMountainGoldScene;
      
      Scene hightMountainScene = new Scene("Monster", "highMountain", "you found a Monster!", "prepare for battle!");
      scenes[8] = hightMountainScene;
      
      return scenes;
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
