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
public class InvintoryView extends View {
    private void invintoryView(){
        Items[] inventory = GameControl.getSortedInventoryList();
        
        this.console.println("\nList of Inventory Items");
        this.console.println("Description" + "\t" + "Effect" + "\t" + "Type of Item");
        
        for (Items items : inventory) {
            this.console.println(items.getName() + "\t   "
            + items.getEffect() + "\t   " + items.getType());
        }
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
