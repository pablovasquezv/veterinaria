package servicios;

import interfaces.ICirujia;

/**
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 21:20
 * @proyect veterinaria
 */
public class ServicioCirujia implements ICirujia {
    @Override
    public void cirujia() {
        System.out.println("Se le realizado una Cirujia al animal.");
    }
}
