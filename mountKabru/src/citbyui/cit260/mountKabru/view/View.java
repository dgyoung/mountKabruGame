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

        char selection = ' ';
        do {
            
            System.out.println(displayMessage);
            
            // prompt for and get players name
            String input = this.getInput();
            selection = input.charAt(0);
            // do the requwsted action and display the next view
            this.doAction(selection);

        } while (selection != 'Q');
    }
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = "";
        while (!valid) {
            
            selection = keyboard.nextLine();
            selection = selection.trim().toUpperCase();

            if (selection.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;

            }

            break;
        }
        return selection;
    }
}
