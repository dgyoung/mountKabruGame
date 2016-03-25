/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Items;
import byui.MountKabru.Control.GameControl;

/**
 *
 * @author Moose
 */
public class InvintoryMenuView extends View {
    public InvintoryMenuView(){
    super("\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n | Invintory Menu                                                           |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nN - Look in Invintory"                
                        +"\nQ - Quit"
                        +"\n-------------------------------------------------------------------------------");
}
   @Override
    public boolean doAction(String choice) 
    {
                 
        
        switch (choice) {
            case "N" :
                this.Invintory();
                break;
                    
          default:
             ErrorView.display("InvintoryMenuView","\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }

    private void Invintory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
