
package ejercicio4_16;

/**
 *
 * @author Alego
 */
public class Pajaro extends Animales implements Volador {
    @Override
    public void volar() {
        System.out.println("El pajaro esta nadando");
    }
}