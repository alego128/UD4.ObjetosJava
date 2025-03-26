
package usuarios;

/**
 *
 * @author Alego
 */
public class Libro {
    private String ISBN;
    String titulo;
    public Genero genero;
    public int ejemplaresDisponibles;

    public Libro(String ISBN, String titulo, Genero genero, int ejemplaresDisponibles) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.genero = genero;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public Libro(String titulo, Genero genero, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.genero = genero;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    @Override
    public String toString() {
        return "ISBN: "+ISBN+" Titulo: "+titulo+" GENERO: "+genero+" EJEMPLARES DISPONIBLES: "+ejemplaresDisponibles;
    }
    
}

enum Genero {
    NOVELA, CIENCIA, HISTORIA;
}