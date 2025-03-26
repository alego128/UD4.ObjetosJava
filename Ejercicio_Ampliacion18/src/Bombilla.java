
/**
 *
 * @author Alego
 */
public class Bombilla {

    private boolean encendida = false;
    private static boolean interruptor = true;

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean isInterruptor() {
        return interruptor;
    }

    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
    }

    public void estadoBombilla() {
        if (encendida == true && interruptor == true) {
            System.out.println("La bombilla esta encendida");
        } if (encendida == false && interruptor == false){
            System.out.println("La bombilla esta apagada");
        }
    }

    public static void encenderInterruptor() {
        interruptor = true;  
    }
    
    public static void apagarInterruptor() {
        interruptor = false;
    }
    
}