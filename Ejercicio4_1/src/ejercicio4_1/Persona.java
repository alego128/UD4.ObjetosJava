
package ejercicio4_1;

/**
 *
 * @author Alego
 */
public class Persona {

    private String nombre;
    private int edad;
    private double estatura;

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public void cumplirAños(int edad) {
        edad = edad++; 
    }
    
    public void crecer(double incremento) {
        estatura = estatura + incremento;
    }
    
    
}
