package servicios;

import interfaces.IVacunacion;

/**
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 20:56
 * @proyect veterinaria
 *
 * Clase que implementa la interfaz Vacunacion.
 */
public class ServicioVacunacion implements IVacunacion {
    @Override
    public void vacunar() {
        System.out.println("Se ha Vacunando al animal");
    }
}
