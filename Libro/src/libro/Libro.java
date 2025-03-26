
package libro;

/**
 *
 * @author Alego
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
   
    public void prestar() {
        if (disponible == true) {
            disponible = false;
            System.out.println("El libro "+titulo+" ha sido prestado");
        } else {
            System.out.println("El libro "+titulo+" no está disponible");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("El libro se llama: "+titulo+" el autor es "+autor+" se publicó en el año "+anioPublicacion+" y se encuentra "+disponible);
    }
    
}
