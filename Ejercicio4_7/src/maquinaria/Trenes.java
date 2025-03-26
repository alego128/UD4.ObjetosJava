/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaria;

import maquinaria.*;
import personal.*;

/**
 *
 * @author Alego
 */
public class Trenes {
    
    Vagones[] vagon;
    Locomotora locomotoras;
    int numeroVagones;
    private final Maquinista maquinista;

    public Trenes(Maquinista maquinista, Locomotora locomotoras) {
        this.maquinista = maquinista;
        this.vagon = new Vagones[5];
        this.locomotoras = locomotoras;
        this.numeroVagones = 0;
    }

    public void engancharVagones(Vagones vagones) {
        if (numeroVagones < 5) {
            vagon[numeroVagones] = vagones;
            numeroVagones++;
            System.out.println("Se enganchó el vagón"+vagones.identificador);
        } else {
            System.out.println("el tren está lleno");
        }

    }

    public void quitarVagones(int indice) {
        if (indice >= 0 && indice < numeroVagones) {
            
            for (int i = indice; i < numeroVagones; i++) {
                
            vagon[indice] = null;
            }
            numeroVagones = indice;
            System.out.println("quedan "+numeroVagones+" vagones enganchados");
        } else {
            System.out.println("no se puede desengachar ese vagón");
        }

    }

}