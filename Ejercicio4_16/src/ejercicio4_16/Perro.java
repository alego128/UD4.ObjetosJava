
package ejercicio4_16;

/**
 *
 * @author Alego
 */
public class Perro extends Animales implements Corredor {
    @Override
    public void correr() {
        System.out.println("El perro esta corriendo");
    }
}