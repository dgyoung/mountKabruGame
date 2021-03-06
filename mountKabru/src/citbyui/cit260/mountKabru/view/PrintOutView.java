/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Actor;
import byui.MountKabru.Control.GameControl;
import byui.MountKabru.exceptions.GameControlException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import mountkabru.MountKabru;

/**
 *
 * @author Moose
 */
public class PrintOutView extends View {

    public PrintOutView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n | Dapper Dan pulls out a quill and asks                        |"
                + "\n | 'so what do you want me to write ?'                            |"
                + "\n------------------------------------------------------------------------------"
                + "\nN - Write out a list for Monsters and there Description"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------------------------------");

    }

    
    
     
    @Override
    public boolean doAction(String choice) {
     
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.listMonsters();
                break;
            default:
                ErrorView.display("PrintOutView ", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

   public void listMonsters( ) {
       
    Actor[] monsters = Actor.values();
    String[] monsterNames = new String[monsters.length];
    String monsterDesc = "";
     String value = "";
        this.console.println("Where would you like to save your file?");
        try {
            value = this.keyboard.readLine(); //Get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            } catch (Exception e) {
             this.console.println(e.getMessage());
         }
        
        String filePath = value;
        
       for (int i=0; i<monsters.length; i++){
            monsterNames[i] = padString(monsters[i].getName()) + padString(monsters[i].getenamyDiscription());
        }
        
        Arrays.sort(monsterNames);
        
         for (int i=0; i<monsters.length; i++){
            monsterDesc += monsterNames[i] + "\n";
        }
        
//        for (int i=0;i<monsterNames.length;i++){ 
            
          String listMonsters = "\n"
                + "\n|------------------------------------------------------------|"
                + "\n|                                                            |"
                + "\n|     ****        Monster  List     ****             |"
                + "\n|     ****        and Description     ****             |"
                + "\n|------------------------------------------------------------|"
                + "\n The Monsters                                         "
                + "\n----Monters--------------Description-------------------------"
                + "\n"  + monsterDesc           
                + "\n-------------------------------------------------------------";

             FileOutputStream fops = null;
        try {
            fops = new FileOutputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream output = null;
        try {
            output = new ObjectOutputStream(fops);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            output.writeObject(listMonsters); //write game to object File
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException ex2) {
                    this.console.println("Error Closing File");
                }
            }
        }
          
            this.console.println("Dapper Dan has successfully written down your report"
                    + "monster names: " +monsterDesc);
//        }
    }
   
   public String padString(String string) {
        
        while (string.length() < 20) {
            
            string = string + " ";
        }
        return string;
    }
   
}

   

            



  