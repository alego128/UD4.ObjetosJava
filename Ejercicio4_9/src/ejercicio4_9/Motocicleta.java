/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_9;

/**
 *
 * @author Alego
 */
public class Motocicleta extends Vehiculo{
    
    public boolean tieneSidecar;

    public Motocicleta(boolean tieneSidecar, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }
    
    public void mostrarDetalles() {
        System.out.println("La marca del vehiculo es: "+marca);
        System.out.println("El modelo del vehiculo es: "+modelo);
        System.out.println("El anio del vehiculo es: "+anio);
        System.out.println("Tiene sidecar el vehiculo: "+tieneSidecar);
    }
}
