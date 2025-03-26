
/**
 *
 * @author Alego
 */
public class Main {
    public static void main(String[] args) {
        
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();
        
        b1.setEncendida(true);
        b2.setEncendida(true);
        b3.setEncendida(true);
        
        b1.estadoBombilla();
        b2.estadoBombilla();
        b3.estadoBombilla();
        
        b1.setEncendida(false);
        b2.setEncendida(false);
        b3.setEncendida(false);
        
        b1.estadoBombilla();
        b2.estadoBombilla();
        b3.estadoBombilla();
        
        Bombilla.encenderInterruptor();
        
        b1.setEncendida(true);
        b2.setEncendida(true);
        b3.setEncendida(true);
        
        b1.estadoBombilla();
        b2.estadoBombilla();
        b3.estadoBombilla();
        
        Bombilla.apagarInterruptor();
        
        b1.estadoBombilla();
        b2.estadoBombilla();
        b3.estadoBombilla();
        
    }
}
