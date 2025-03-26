
/**
 *
 * @author Alego
 */
public final class MatematicasUtil {
    
    public static final double PI = 3.14;

    public static double calcularAreaCirculo(double radio) {

        if (radio < 0) {
            System.out.println("El radio debe ser mayor de 0");
        }
        return PI * (radio * radio);
    }

    public static double calcularPerimetroRectangulo(double largo, double ancho) {

        if (ancho < 0 || largo < 0) {
            System.out.println("El largo y el ancho deben ser mayor que 0");
        }
        return (largo + ancho) * 2;
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("El numero no puede ser menor que 0");
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double redondearDecimal(double numero, int decimales) {
        if (decimales < 0) {
            System.out.println("Los decimales no pueden ser menores que 0"); 
        }
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }
}
