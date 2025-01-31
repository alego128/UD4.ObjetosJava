
package ejercicio4_9;

/**
 *
 * @author Alego
 */
public class Vehiculo {
 
    public String marca;
    public String modelo;
    public int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public void mostrarDetalles(String marca, String modelo, int anio) {
        System.out.println("La marca del vehiculo es: "+marca);
        System.out.println("El modelo del vehiculo es: "+modelo);
        System.out.println("El anio del vehiculo es: "+anio);
    }
    
    
    
}
