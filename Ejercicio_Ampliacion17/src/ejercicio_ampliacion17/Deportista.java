
package ejercicio_ampliacion17;

/**
 *
 * @author Alego
 */
public class Deportista extends Entrenamiento{

    private String nombre, deporte;
    public static int edad;
    private static int totalDeportistas = 0;

    public Deportista(String nombre, String deporte, int edad) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Deportista.edad = edad;
    }

    public static int getTotalDeportistas() {
        return totalDeportistas;
    }

    public static void setTotalDeportistas(int totalDeportistas) {
        Deportista.totalDeportistas = totalDeportistas;
    }
    
    @Override
    public String toString() {
        return "Deportista nombre =" +nombre+ ", edad =" + edad + ", deporte = " + deporte;
    }
    
    @Override
    public void entrenar() {
        System.out.println(getNombre() + " esta entrenando");
    }
}
