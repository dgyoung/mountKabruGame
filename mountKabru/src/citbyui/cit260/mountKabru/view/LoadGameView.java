/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.GameControl;

/**
 *
 * @author Moose
 */
public class LoadGameView extends View {

    public LoadGameView() {
        super("What is the name of the game you wish to load?");
    }

    @Override
    public boolean doAction(String filePath) {

       
        
        try {
            //load a save game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
            return false;
        }
        
        this.console.println("Your game has lodded now get to work! you loaded:  " + filePath);
        
         GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        return true;
    }
}
