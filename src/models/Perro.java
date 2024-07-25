package models;

/**
 * Principio de Abierto/Cerrado (OCP)
 * Las clases deben estar abiertas para extensión pero cerradas para modificación
 *
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 20:35
 * @proyect veterinaria
 */


/**
 * Clase para representar un perro, que extiende la clase Animal.
 */
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre, "Perro");
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
