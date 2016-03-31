/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Location;
import byui.MountKabru.Control.MapControl;
import java.util.Scanner;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class MapMenuView extends View {

    public MapMenuView() {
        super("\n   must follow example= '0 6' "
            + "\n "  
            + "\n         (0 0) - Return to town "
            + "\n  (0 1) - (0 6) - Plains         Hero Level: 1-10"
            + "\n  (1 0) - (1 6) - Jungle         Hero Level: 10-25"
            + "\n  (2 0) - (2 6) - Dark Forest    Hero Level: 25-40"
            + "\n  (3 0) - (2 6) - High Mountain  Hero Level: 40-50"
            + "\n"
            + "\n  (Q) - quit");
    }
    
    
    
    @Override
    public boolean doAction(String value) {
        String choice = value.toUpperCase(); 
        String[] valueArray = choice.split(" ");
        int stage;
        int level;
        
        try {
            stage = Integer.parseInt(valueArray[0]);
            level = Integer.parseInt(valueArray[1]);
        } catch (NumberFormatException nfe) {
            ErrorView.display("MapMenuView", "You entered the wrong number");
            return false;
        }
        
        if ((stage < 1 || stage > 4) || (level < 1 || level > 8)) {
        ErrorView.display("MapMenuView", "You have entered in the wrong number please try again.");
        return false;
        }
        
        if (stage == 1 && stage == 1) {
            return true;
        }
        
      
        
        
        
        return false;
    }

    
    
    private void Adventure() {
        BattleMenuView adventureView = new BattleMenuView();
        adventureView.display();
        
    }

}