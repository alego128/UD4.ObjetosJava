
package libro;

/**
 *
 * @author Alego
 */
public class Main {
    public static void main(String[] args) {
        
        Libro l1 = new Libro("El mundo", "Lucia Benitez", 2005, false);
        Libro l2 = new Libro("Universo", "Alejandro Gonzalez", 2009, true);
        Libro l3 = new Libro("Casa", "Pepita", 2002, true);
        
        Biblioteca biblio = new Biblioteca(5);
        
        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.agregarLibro(l3);
        
        System.out.println("Libros disponibles: ");
        biblio.mostrarLibros();
        
        biblio.prestarLibro("Casa");
        
        biblio.mostrarLibros();
    }
}
