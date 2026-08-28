package edu.dosw.bootcamp.lab.creacionales.Reto2;

public class SuitException extends Exception {

    public static final String FABRIC_REQUIRED = "Se requiere la tela para confeccionar el traje.";
    public static final String JACKET_REQUIRED = "Se requiere el saco para confeccionar el traje.";
    public static final String TROUSERS_REQUIRED = "Se requiere el pantalón para confeccionar el traje.";
    public static final String INVALID_OPTION = "Opción inválida. Debe seleccionar s o n.";

    public SuitException(String message) {
        super(message);
    }
}
