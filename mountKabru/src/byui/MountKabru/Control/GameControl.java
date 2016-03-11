/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKabru.Game;
import Classes.CIT260.MountKabru.Map;
import Classes.CIT260.MountKabru.Player;
import static jdk.nashorn.internal.objects.NativeArray.map;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        MountKabru.setPlayer(player); //save the player
        
        return player;
        }
    
   

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        MountKabru.setCurrentGame(game); // save in MountKabru
        
        game.setPlayer(player); // save player in game
        Map map = MapControl.createMap(); // create and initalize new map
        game.setMap(map); // save map in game
       // move actor to starting position in the mad
      MapControl.moveActorsToStartingLocation(map);
    }
    
}       // new code