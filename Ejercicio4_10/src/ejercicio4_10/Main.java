
package ejercicio4_10;

/**
 *
 * @author Alego
 */
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];

        figuras[0] = new Circulo("Circulo");
        figuras[1] = new Rectangulo("Rectangulo");
        
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].mostrarInformacion();
            System.out.println("Area: "+figuras[i].calcularArea());
        }
    }
}
