
package libro;

/**
 *
 * @author Alego
 */
public class Biblioteca {
    
    private Libro[] libros;
    private int contador;

    public Biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        contador = 0;
    }
    
    public void agregarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
        } else {
            System.out.println("La biblioteca esta llena");
        }
    }
    
    public void mostrarLibros() {
        if (contador == 0) {
            System.out.println("No hay libros en la biblioteca");
        } else {
            for (int i = 0; i < contador; i++) {
                libros[i].mostrarInfo();
            }
        }
    }
    
    public void prestarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo) && libros[i].isDisponible() == true) {
            libros[i].prestar();
            }
        }
        System.out.println("No se encontró el libro con el titulo "+titulo);
    }
}
