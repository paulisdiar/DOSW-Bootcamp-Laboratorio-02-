package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto6;

public class EmergencyException extends Exception {

    public static final String INVALID_COUNT = "Patient count must be greater than zero.";
    public static final String INVALID_SEVERITY = "Invalid severity level: ";
    public static final String INVALID_PRIORITY = "Invalid priority: ";

    public EmergencyException(String message) {
        super(message);
    }
}
