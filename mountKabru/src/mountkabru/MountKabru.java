/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import Classes.CIT260.MountKabru.Actors;
import Classes.CIT260.MountKabru.Items;
import Classes.CIT260.MountKabru.BattleScene;
import Classes.CIT260.MountKabru.Game;
import Classes.CIT260.MountKabru.Location;
import Classes.CIT260.MountKabru.Map;
import Classes.CIT260.MountKabru.Player;
import Classes.CIT260.MountKabru.Scene;
import citbyui.cit260.mountKabru.view.StartProgramView;

/**
 *
 * @author David
 */
public class MountKabru {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
    
   public static Game getCurrentGame() {
       return currentGame;
   }
   public static void setCurrentGame(Game currentGame) {
       MountKabru.currentGame = currentGame;
   }
   public static Player getPlayer() {
       return player;
   }
   public static void setPlayer(Player player) {
       MountKabru.player = player;
   }
    
    
    
    
    
}