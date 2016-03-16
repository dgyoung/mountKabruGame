/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKabru.Game;
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
        Map map = new Map(20, 20);

// create a list of the different scenes in the game
        Scene[] scenes = createScenes();

// assigne the different scenes to locations in the map
        assignScenesToLocations(map, scenes);

        return map;
    }

    private static Scene[] createScenes() {
        Game game = MountKabru.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "\n this is the scene description, "
                + "\n we will use it to descripe the starting scene.");
        startingScene.setMapSympol(" FST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(420);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
          "\n this is the scene description, "
                + "\n we will use it to descripe the starting scene.");
        finishScene.setMapSymbol(" FN ");
        finishScene.setblocked(false);
        finishScene.setTravelTime(double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
    }
}
