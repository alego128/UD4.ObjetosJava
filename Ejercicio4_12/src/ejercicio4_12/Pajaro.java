/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_12;

/**
 *
 * @author Alego
 */

public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pío pío");
    }

    @Override
    public String moverse() {
        return "Vuela por el aire";
    }

}