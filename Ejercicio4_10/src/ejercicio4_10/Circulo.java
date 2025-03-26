
package ejercicio4_10;

/**
 *
 * @author Alego
 */
public class Circulo extends Figura{
    
    public double radio;

    public Circulo(String nombre) {
        super(nombre);
    }
    
    
    public double calcularArea() {
     return Math.PI * radio * radio;
    }
}
