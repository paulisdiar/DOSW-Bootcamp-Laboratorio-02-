package edu.dosw.bootcamp.lab.comportamiento.Reto6;

public class EmergencyException extends Exception {

    public static final String INVALID_COUNT = "La cantidad de pacientes debe ser mayor a cero.";
    public static final String INVALID_SEVERITY = "Nivel de gravedad inválido: ";
    public static final String INVALID_PRIORITY = "Prioridad inválida: ";

    public EmergencyException(String message) {
        super(message);
    }
}
