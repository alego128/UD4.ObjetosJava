
package usuarios;

/**
 *
 * @author Alego
 */
public class Usuario extends Persona{
    
    private String dni;
    private String nombreCompleto;
    private Direccion direccion;

    
    public Usuario(String dni, String nombreCompleto, Direccion direccion, String nombre, int edad) {
        super(nombre, edad);
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void prestarLibro(Libro libro) {
        if (libro.ejemplaresDisponibles > 0) {
            libro.ejemplaresDisponibles--;
        } else {
            System.out.println("No hay ejemplares disponibles");
        }
    }

    @Override
    public String obtenerTipo() {
        return "LECTOR";
    }
    
    @Override
    public String toString() {
        return super.toString() + "DNI: "+dni+"n"+direccion.toString();
    }
}
