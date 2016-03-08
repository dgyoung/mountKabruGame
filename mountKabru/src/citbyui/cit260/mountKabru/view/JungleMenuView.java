/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.mountKabru.view;


/**
 *
 * @author Moose
 */
public class JungleMenuView extends View{
    public JungleMenuView(){
    super("\n"
                        + "\n------------------------------------------------------------------------------"
                        + "\n | Jungle Menu                                                           |"
                        + "\n------------------------------------------------------------------------------"
                        +"\nN - Look for monsters"
                        +"\nG - Serch Invantory"
                        +"\nS - Use potion"
                        +"\nQ - Quit"
                        +"\n-------------------------------------------------------------------------------");
    
}
    
@Override
    public boolean doAction(char choice) 
    {
                 
        
        switch (choice) {
            case 'N' :
                this.LookForMonsters();
                break;
          case 'G' :
                this.SerchInvantory();
                break;  
           case 'S':
                this.UsePotion();
                break;               
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
        }
        return false;
    }

    

    private void LookForMonsters() {
         BattleMenuView battleMenuView = new BattleMenuView();
        battleMenuView.display();
    }

    private void SerchInvantory() {
         System.out.println("*** you for got your bag, you have nothing ***");
    }

    private void UsePotion() {
       System.out.println("*** you have no potions ***");
    }


    
} 
