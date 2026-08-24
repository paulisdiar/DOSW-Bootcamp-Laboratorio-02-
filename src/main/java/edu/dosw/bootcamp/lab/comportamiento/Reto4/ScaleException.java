package src.main.java.edu.dosw.bootcamp.lab.comportamiento.Reto4;

public class ScaleException extends Exception {

    public static final String INVALID_UNIT = "Unidad de peso desconocida: ";
    public static final String INVALID_AMOUNT = "La cantidad debe ser mayor a cero.";
    public static final String INVALID_COUNT = "La cantidad de pesajes debe ser mayor a cero.";

    public ScaleException(String message) {
        super(message);
    }
}
