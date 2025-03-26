
package ejercicio_ampliacion17;

/**
 *
 * @author Alego
 */
public class EntrenamientoFutbol extends Entrenamiento implements Compite{

    private String tipoEntrenamiento;

    public EntrenamientoFutbol(String tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
    }

    public String getTipoEntrenamiento() {
        return tipoEntrenamiento;
    }

    public void setTipoEntrenamiento(String tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
    }
    
    
    
    @Override
    public void entrenar() {
        System.out.println("El futbolista esta entrenando futbol, concretamente: "+getTipoEntrenamiento());
    }

    @Override
    public String competir() {
        return "El futbolista esta compitiendo un partido";
    }
    
}
