package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4;

public class ScaleException extends Exception {

    public static final String INVALID_UNIT = "Unknown weight unit: ";
    public static final String INVALID_AMOUNT = "Amount must be greater than zero.";
    public static final String INVALID_COUNT = "Number of weighings must be greater than zero.";

    public ScaleException(String message) {
        super(message);
    }
}
