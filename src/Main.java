import interfaces.ICirujia;
import interfaces.IEstetica;
import interfaces.IVacunacion;
import models.Animal;
import models.Gato;
import models.Perro;
import models.Veterinaria;
import servicios.ServicioCirujia;
import servicios.ServicioEstetica;
import servicios.ServicioVacunacion;

/**
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 20:06
 * @proyect veterinaria
 */

public class Main {

    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();

        Animal perro = new Perro("Max", "Labrador");
        veterinaria.agregarAnimal(perro);

        Animal gato = new Gato("Luna");
        veterinaria.agregarAnimal(gato);
        veterinaria.mostrarAnimal();

        IVacunacion servicioVacunacion= new ServicioVacunacion();
        servicioVacunacion.vacunar();

        IEstetica servicioEstetica= new ServicioEstetica();
        servicioEstetica.bañar();
        servicioEstetica.cortarPelo();
        servicioEstetica.cortarUñas();

        ICirujia servicioCirujia= new ServicioCirujia();
        servicioCirujia.cirujia();
    }
}