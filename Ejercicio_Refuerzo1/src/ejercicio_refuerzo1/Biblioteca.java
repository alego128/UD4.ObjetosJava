
package ejercicio_refuerzo1;

/**
 *
 * @author Alego
 */
public class Biblioteca {
    
    private Libro[] libros;
    private int contador = libros.length;

    public Biblioteca(Libro[] libros) {
        this.libros = libros;
    }    
    
    public void agregarLibro(Libro libro) {
        
    }
    
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca: ");
        for (int i = 0; i < contador; i++) {
            libros[i].mostrarInfo();
        }
    }
}
