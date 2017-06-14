
package lapr.project.utils;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class UserRegistException extends IllegalArgumentException implements Serializable{

    /**
     * Creates a new instance of <code>UserRegistException</code> without detail
     * message.
     */
    public UserRegistException() {
        super("Erro de Registo");
    }

    /**
     * Constructs an instance of <code>UserRegistException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UserRegistException(String msg) {
        super(msg);
    }
}
