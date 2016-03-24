/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.Control;

import Classes.CIT260.MountKabru.Actors;
import Classes.CIT260.MountKabru.Game;
import Classes.CIT260.MountKabru.Items;
import Classes.CIT260.MountKabru.Map;
import Classes.CIT260.MountKabru.Player;
import byui.MountKabru.exceptions.GameControlException;
import java.util.Arrays;
import static jdk.nashorn.internal.objects.NativeArray.map;
import mountkabru.MountKabru;

/**
 * *
 * @author Moose
 */
public class GameControl {

    public static Player createPlayer(String playersName) throws GameControlException {
        if (playersName == null) {
           throw new GameControlException("the players name is null");
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
        game.setActors(Actors.values());
        
        Map map = MapControl.createMap(); // create and initalize new map
        game.setMap(map); // save map in game
       // move actor to starting position in the mad
      MapControl.moveActorsToStartingLocation(map);
    }

    public static Items[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static String listOfTheMonsters(Actors[] actors) throws GameControlException{
        
         if (actors == null) {
             throw new GameControlException("the array of actors is null");
         }
         
        // Here I am creating a new array that I will sort the names into to arrange them.
        String[] newNames = new String[actors.length];

        //This for statement is here to count the names from the array above into a list
        for (int i = 0; i < newNames.length;i++) {

            //newNames is the name of the array, Here I am telling the array to find the index of the name using the ge
            //getName function. After it is called it puts the name into the empty location in the newNames array.
            newNames[i] = actors[i].getName();
        }


        String names = "\n";
        // Here I am sorting the array of newNames alphabetically
        Arrays.sort(newNames);

        // This is where I am assigning the names a variable of "name" from the newNames array data-types
        for (String name : newNames)
            names += name + "\n";
        
        //I return the new names in the sorted order.
        return names;

    }
}      