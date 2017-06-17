/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

/**
 *
 * @author HP
 */
public class CreateStandException extends Exception {

    /**
     * Creates a new instance of <code>CreateStandException</code> without
     * detail message.
     */
    public CreateStandException() {
        super("Incorrect infomation");
    }

    /**
     * Constructs an instance of <code>CreateStandException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CreateStandException(String msg) {
        super(msg);
    }
}
