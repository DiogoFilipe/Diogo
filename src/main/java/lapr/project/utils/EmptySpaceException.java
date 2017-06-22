/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.Serializable;

/**
 *
 * @author Diogo
 */
public class EmptySpaceException extends IllegalArgumentException implements Serializable {

    /**
     * Creates a new instance of <code>EmptySpaceException</code> without detail
     * message.
     */
    public EmptySpaceException() {
    }

    /**
     * Constructs an instance of <code>EmptySpaceException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptySpaceException(String msg) {
        super("Empty information on parameter "+msg);
    }
}
