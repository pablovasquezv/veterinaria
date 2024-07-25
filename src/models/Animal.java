package models;
/**
 * Principio de Responsabilidad Única (SRP)
 * Cada clase debe tener una única responsabilidad
 *
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 20:19
 * @proyect veterinaria
 */

/**
 * Clase para representar a un animal
 */

public abstract class Animal {
    private String nombre;
    private String raza;


    /**
     *
     */
    public Animal() {
    }

    /**
     * @param nombre
     * @param raza
     */
    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
