/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mountkabru.MountKabru;

/**
 *
 * @author David
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard;
    protected final PrintWriter console;

    public View(String displayMessage) {
        this.displayMessage = displayMessage;
        
        keyboard = MountKabru.getInFile();
        console = MountKabru.getOutFile();
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
       
       
        String value = "";
        boolean valid = false;
        while (!valid){
            this.console.println("\n" + this.displayMessage);
            
            try {
                value = this.keyboard.readLine();
            } catch (IOException ex) {
               ErrorView.display("StartProgramView","Key board Error: " + ex.getMessage());
            }
            value = value.trim();
            
            if (value.length() < 1){
                this.console.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }
}
