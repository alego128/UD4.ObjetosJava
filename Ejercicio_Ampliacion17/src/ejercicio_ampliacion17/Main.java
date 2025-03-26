package ejercicio_ampliacion17;

/**
 *
 * @author Alego
 */
public class Main {

    public static void main(String[] args) {

        Futbolista futbolista1 = new Futbolista("Delantero", 41, "Neymar", "Futbol", 30);
        Futbolista futbolista2 = new Futbolista("Defensa", 3, "Ramos", "Futbol", 34);

        futbolista1.setEdad(32);
        futbolista1.setNombre("Ronaldo");
        futbolista2.anotarGol(2);

        if (futbolista1 instanceof Deportista) {
            System.out.println("Este futbolista implementa compite");
        } else {
            System.out.println("Este futbolista no implementa compite");
        }

        if (futbolista2 instanceof Deportista) {
            System.out.println("Este futbolista implementa compite");
        } else {
            System.out.println("Este futbolista no implementa compite");
        }

        System.out.println(futbolista1);
        System.out.println(futbolista2);

    }

    public static void modificarEdad(int edad) {

        edad = Deportista.setEdad(30);
    }

}
