
package ejercicio4_9;

/**
 *
 * @author Alego
 */
public class Main {

    public static void main(String[] args) {

        var coche = new Coche(4, "toyota", "q3", 2000);
        var motocicleta = new Motocicleta(false, "yamaha", "3s", 1999);
        
        coche.mostrarDetalles();
        motocicleta.mostrarDetalles();
    }
}
