/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;

import byui.MountKabru.Control.GameControl;
import Classes.CIT260.MountKabru.Actors;
import mountkabru.MountKabru;
/**
 *
 * @author Moose
 */
public class GameTipsView extends View {
    
    public GameTipsView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n|  You come upon an dapper man        |"
                + "\n|  in twon. He streches his hand out      |"
                + "\n|  and says 'Give me a coin my friend and I will   |"
                + "\n|  tell you something of valule...'    |"
                + "\n------------------------------------------"
                + "\n"
                + "\nA - Average Hit Points for monsters in the world"
                + "\nL - List of Monsters Alphabetically "
                + "\nS - Your Stats "
                + "\nQ - Quit"
                + "\n--------------------------------------");
    }

    private String promptMessage;

@Override
    public boolean doAction(char choice) 
    {


        switch (choice) {
            case 'A': 
                this.avgMonsters();
                break;
            case 'L':
                this.listMonsters();
                break;
            case 'S':
                this.heroStats();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Get lost");
        }
        return false;
    }


    private void listMonsters() {
        Actors[] actors = MountKabru.getCurrentGame().getActors();
        String listOMonsters = GameControl.listOfTheMonsters(actors);
        System.out.println("\n Enjoy the lits try not to die too fast. \n"
            + listOMonsters);
    }

    private void heroStats() {
        
        System.out.println("\nI Don't know don't care.");
    } 

    private void avgMonsters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
