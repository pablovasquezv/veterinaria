package servicios;

import interfaces.IEstetica;

/**
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 20:59
 * @proyect veterinaria
 *
 * Clase que implementa la interfaz Estetica.
 */
public class ServicioEstetica implements IEstetica {
    @Override
    public void bañar() {
        System.out.println("Se ha bañado al animal");
    }

    @Override
    public void cortarPelo() {
        System.out.println("se ha cortado pelo al animal");
    }

    @Override
    public void cortarUñas() {
        System.out.println("Se han cortado las uñas al animal");
    }
}
