/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.CIT260.MountKapru.exceptions;

/**
 *
 * @author David
 */
public class AttackControlException extends Exception {

    public AttackControlException() {
    }

    public AttackControlException(String message) {
        super(message);
    }

    public AttackControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public AttackControlException(Throwable cause) {
        super(cause);
    }

    public AttackControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
