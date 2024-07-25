package models;

/**
 * Principio de Sustitución de Liskov (LSP)
 * <p>
 * Las instancias de una clase derivada deben ser capaces de sustituir a las instancias de la clase base sin alterar
 * el comportamiento del programa
 *
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 20:48
 * @proyect veterinaria
 * <p>
 * Clase para representar un gato, que extiende la clase Animal
 */
public class Gato extends Animal {

    /**
     * Constructor con parámetros.
     *
     * @param nombre
     */
    public Gato(String nombre) {
        super(nombre, "Gato");
    }
}
