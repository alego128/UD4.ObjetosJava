
package ejercicio_ampliacion17;

/**
 *
 * @author Alego
 */
public class Futbolista extends Deportista{

    public String posicion;
    public int golesMarcados;

    public Futbolista(String posicion, int golesMarcados, String nombre, String deporte, int edad) {
        super(nombre, deporte, edad);
        this.posicion = posicion;
        this.golesMarcados = golesMarcados;
    }
    
    public void anotarGol(int golesMarcados) {
        golesMarcados++;
    }
    
    @Override
    public String toString() {
        return "Futbolista nombre =" +getNombre()+", edad =" +getEdad()+ ", deporte ='" + getDeporte() + ", posicion =" +posicion+ ", golesMarcados =" +golesMarcados;
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " esta entrenando chutes a porteria");
    }
}
