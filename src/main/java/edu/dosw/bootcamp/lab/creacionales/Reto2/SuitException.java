package src.main.java.edu.dosw.bootcamp.lab.creacionales.Reto2;

public class SuitException extends Exception {

    public static final String FABRIC_REQUIRED = "Fabric is required to build the suit.";
    public static final String JACKET_REQUIRED = "Jacket is required to build the suit.";
    public static final String TROUSERS_REQUIRED = "Trousers are required to build the suit.";

    public SuitException(String message) {
        super(message);
    }
}


