package lapr.project.utils;

import java.io.Serializable;

/**
 *
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class InvalidMonthException extends IllegalArgumentException implements Serializable {

    private static final long serialVersionUID = -1569687538648729468L;

    /**
     * Exception for invalid month
     */
    public InvalidMonthException() {
        super("Invalid month!");
    }

    /**
     * Exception for invalid month (with custom message)
     *
     * @param message
     */
    public InvalidMonthException(String message) {
        super("Invalid month on" + message);
    }
}
