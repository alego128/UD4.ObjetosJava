
package usuarios;

/**
 *
 * @author Alego
 */
public abstract class Persona {
    
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract String obtenerTipo();
    
    @Override
    public String toString() {
        return "Nombre: "+nombre+" Edad: "+edad;
    }
}
