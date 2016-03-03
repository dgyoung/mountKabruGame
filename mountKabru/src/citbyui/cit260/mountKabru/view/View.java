/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import java.util.Scanner;

/**
 *
 * @author Moose
 */
public abstract class View implements  ViewInterface {
    protected String displayMessage;
    public View() {
        
    }
    public View(String message){
        this.displayMessage = message;
    }
    @Override
    public void display() {
        boolean done = false;
        do{ 
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view when done == true
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done); // exit the view when done == truw
        
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