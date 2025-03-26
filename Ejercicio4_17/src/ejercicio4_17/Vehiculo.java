
package ejercicio4_17;

/**
 *
 * @author Alego
 */
public abstract class Vehiculo {

     protected String matricula,marca,tipoDeCombustible;
     protected int anio;

    public Vehiculo(String matricula, String marca, String tipoDeCombustible, int anio) {
        this.matricula = matricula;
        this.marca = marca;
        this.tipoDeCombustible = tipoDeCombustible;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
     
     
}
   
