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
public class EventNotFound extends IllegalArgumentException {

    /**
     * Creates a new instance of <code>EventoNotFound</code> without detail
     * message.
     */
    public EventNotFound() {
    }

    /**
     * Constructs an instance of <code>EventoNotFound</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EventNotFound(String msg) {
        super(msg);
    }
}
