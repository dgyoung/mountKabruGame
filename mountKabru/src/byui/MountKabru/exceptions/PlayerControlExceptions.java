/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.MountKabru.exceptions;

/**
 *
 * @author Moose
 */
public class PlayerControlExceptions extends Exception {

    public PlayerControlExceptions() {
    }

    public PlayerControlExceptions(String string) {
        super(string);
    }

    public PlayerControlExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PlayerControlExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public PlayerControlExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
