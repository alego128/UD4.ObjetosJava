
package ejercicio4_10;

/**
 *
 * @author Alego
 */
public class Rectangulo extends Figura{

    public double base, altura;

    public Rectangulo(String nombre) {
        super(nombre);
    }
    
    public double calcularArea() {
     return base * altura;
    }
}
