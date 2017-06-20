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
public class EventoNotFound extends IllegalArgumentException {

    /**
     * Creates a new instance of <code>EventoNotFound</code> without detail
     * message.
     */
    public EventoNotFound() {
    }

    /**
     * Constructs an instance of <code>EventoNotFound</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EventoNotFound(String msg) {
        super(msg);
    }
}
