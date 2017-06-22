package lapr.project.utils;

import java.io.Serializable;

/**
 * 
 * @author 1160590_1160795_1160844_1161241_1162109
 */
public class InvalidDayException extends IllegalArgumentException implements Serializable{

    /**
     * Exception for invalid day
     */
    public InvalidDayException() {
        super("Invalid day");
    }

    /**
     * Exception for invalid day (with custom message)
     * @param message
     */
    public InvalidDayException(String message) {
        super("Invalid day on "+ message);
    }
}
