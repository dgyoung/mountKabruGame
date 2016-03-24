/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import java.util.Scanner;

/**
 *
 * @author David
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;

    public View() {
    }

    public View(String displayMessage) {
        this.displayMessage = displayMessage;
    }
    
    @Override
    public void display() {

         boolean done = false;
        do {
            String playersName = this.getInput();
            if (playersName.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playersName);
        } while (!done);
    }
    @Override
    public String getInput() {
       
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid){
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }
}
