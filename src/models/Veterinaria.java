package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Principio de Responsabilidad Única (SRP)
 * Cada clase debe tener una única responsabilidad
 *
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 20:29
 * @proyect veterinaria
 */

/**
 * Clase para representar a una Veterinaria
 */
public class Veterinaria {
    private List<Animal> animales;

    public Veterinaria() {
        this.animales = new ArrayList<>();
    }

    // Método para agregar un animal a la lista de animales
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarAnimal() {
        for (Animal animal : animales) {
            System.out.println("Nombre: " + animal.getNombre() + " Especie: " + animal.getRaza());
        }
    }
}
