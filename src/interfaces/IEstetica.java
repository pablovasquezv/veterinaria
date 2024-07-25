package interfaces;

/**
 * Principio de Segregación de Interfaces (ISP).
 * Los clientes no deben depender de interfaces77 que no utilizan.
 *
 * @version 1.0
 * @autor Pablo
 * @creates 24-07-2024 20:53
 * @proyect veterinaria
 * <p>
 * Interfaces para diferentes servicios ofrecidos por la veterinaria.
 */
public interface IEstetica {

    void bañar();

    void cortarPelo();

    void cortarUñas();
}
