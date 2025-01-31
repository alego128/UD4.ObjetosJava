
package ejercicio4_9;

/**
 *
 * @author Alego
 */
public class Coche extends Vehiculo{
    
    public int numPuertas;

    public Coche(int numPuertas, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    public void mostrarDetalles() {
        System.out.println("La marca del vehiculo es: "+marca);
        System.out.println("El modelo del vehiculo es: "+modelo);
        System.out.println("El anio del vehiculo es: "+anio);
        System.out.println("El numero de puertas del vehiculo es: "+numPuertas);
    }
}
