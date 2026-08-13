package src.main.java.edu.dosw.bootcamp.lab.uml.Reto8;

public abstract class Persona {
    String nombre;
    Integer edad;
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }
}
