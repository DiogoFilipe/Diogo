/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

/**
 *
 * @author Diogo
 */
public class DontHavePermissionException extends Exception {

    /**
     * Creates a new instance of <code>DontHavePermissionException</code>
     * without detail message.
     */
    public DontHavePermissionException() {
        super("You don't have permissions to acess this topic.");
    }

    /**
     * Constructs an instance of <code>DontHavePermissionException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DontHavePermissionException(String msg) {
        super(msg);
    }
}