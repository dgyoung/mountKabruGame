/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import Classes.CIT260.MountKabru.Actors;
import byui.MountKabru.Control.GameControl;
import byui.MountKabru.exceptions.GameControlException;
import java.io.IOException;
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
                + "\nN - Write out a list for Monsters"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------------------------------");

    }

    
    
     
    @Override
    public boolean doAction(String choice) {
     
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.PrintMonsters();
                break;
            default:
                ErrorView.display("PrintOutView ", "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void PrintMonsters() {
        String value = " ";
   
      this.console.println(" Where would you like to save this list? ");
      
         try {
                value = this.keyboard.readLine();
                value = value.trim();
    }
    catch (Exception e ) {
               ErrorView.display("StartProgramView", "Key board Error: " + e.getMessage());
    }
 
     String filePath = value;
        Actors[] actors = MountKabru.getCurrentGame().getActors();
        String listOMonsters = null;
        try {
        listOMonsters = GameControl.listOfTheMonsters(actors);
        } catch (GameControlException e) {
            e.printStackTrace();

   

            }
    }
String monsterList = "\n"
                + "\n|--------------------------------------------------|"
                + "\n|                                                  |"
                + "\n|     ****        Monster  List     ****       |"
                + "\n|                                                  |"
                + "\n|--------------------------------------------------|"
                + "\n The Monsters                               "
                + "\n----------------------------------------------------"
          
                + "\n--------------------------------------";

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
            output.writeObject(monsterReport); //write game to object File
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        this.console.println(monsterReport);