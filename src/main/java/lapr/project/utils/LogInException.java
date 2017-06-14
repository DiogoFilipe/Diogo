
package lapr.project.utils;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class LogInException extends IllegalArgumentException implements Serializable{

    /**
     * Creates a new instance of <code>LogInException</code> without detail
     * message.
     */
    public LogInException() {
        super("Username/password combination incorrect");
    }

    /**
     * Constructs an instance of <code>LogInException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public LogInException(String msg) {
        super(msg);
    }
}