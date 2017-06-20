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
public class ChangeApplicationException extends Exception {

    /**
     * Creates a new instance of <code>ChangeApplicationException</code> without
     * detail message.
     */
    public ChangeApplicationException() {
    }

    /**
     * Constructs an instance of <code>ChangeApplicationException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ChangeApplicationException(String msg) {
        super(msg);
    }
}
