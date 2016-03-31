/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.GameControl;
import Classes.CIT260.MountKabru.Actor;
import byui.MountKabru.exceptions.GameControlException;
import static java.lang.Integer.parseInt;
import mountkabru.MountKabru;
import static java.lang.Integer.parseInt;
import java.util.Arrays;

/**
 *
 * @author Moose
 */
public class GameTipsView extends View {

    public GameTipsView() {
        super("\n"
                + "\n Before you can have any hints you have to guess what number I am thinking between 1 and 1");
    }

    private String realDisplay = "\n"
            + "\n"
            + "\n------------------------------------------"
            + "\n|  You come upon an dapper man        |"
            + "\n|  in twon. He streches his hand out      |"
            + "\n|  and says 'Give me a coin my friend and I will   |"
            + "\n|  tell you something of valule...'    |"
            + "\n------------------------------------------"
            + "\n"
            + "\nA - Average Hit Points for monsters in the world"
            + "\nL - List of Monsters Alphabetically "
            + "\nP - You want me to write  that down for you?"
            + "\nS - Your Stats "
            + "\nQ - Quit"
            + "\n--------------------------------------";

    private String promptMessage;

    @Override
    public boolean doAction(String dapsNumb) {
        int playersNumber = 0;

        try {
            playersNumber = parseInt(dapsNumb);
        } catch (NumberFormatException nf) {
            ErrorView.display("GameTipsView", "You entered the wrong number");
        }

        this.console.println(playersNumber + " is Excactly what I was thinking, Amazing!!");

        this.displayMessage = this.realDisplay;

        String choice = this.getInput().toUpperCase();

        switch (choice) {
            case "A":
                this.avgMonsters();
                break;
            case "L":
                this.listMonsters();
                break;
            case "S":
                this.heroStats();
                break;
            case "P":
                this.PrintOut();
                break;
            default:
                ErrorView.display("GameTipsView", "\n*** Invalid selection *** Get lost");
        }
        return false;
    }

    private void listMonsters() {
        Actor[] monsters = Actor.values();
        String[] monsterNames = new String[monsters.length];
        
        for (int i=0; i<monsters.length; i++){
            monsterNames[i] = monsters[i].getName();
        }
        
        Arrays.sort(monsterNames);
        
        for (int i=0;i<monsterNames.length;i++){
            



            this.console.println("monster names: " +monsterNames[i] );
        }
        
    
       
    }

    private void heroStats() {

        this.console.println("\nI Don't know don't care.");
    }

    private void avgMonsters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void PrintOut() {
        PrintOutView printOutView = new PrintOutView();
       printOutView.display();
    }

}
