
package ejercicio4_11;

/**
 *
 * @author Alego
 */

public class Main {

public static void main(String[] args) {
    
        Libro libro1 = new Libro("Hola", "Ale", "978-3-16-148410-0", 2005);
        Libro libro2 = new Libro("Adios", "Adri", "978-3-16-148410-0", 2007);
        Libro libro3 = new Libro("Manana", "Pablo", "978-0-452-28423-4", 2004);

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println("El libro1 y libro2 son iguales?"+libro1.equals(libro2));

        System.out.println("El libro1 y libro3 son iguales?"+libro1.equals(libro3));
    }
}