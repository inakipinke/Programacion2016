/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pinke
 */
public class Jugador {
    private int puntos;
    private String nombre;

    public Jugador(String nombreR) {
        this.puntos=0;
        this.nombre=nombreR;
    }

    public int getPuntos() {
        return puntos;
    }

    public void addPuntos() {
        puntos += 1;
    }
 
    public String toString(){
        String nombreA=this.nombre;
        while(nombreA.length()< 20) nombreA +=" " ;
        return nombreA+puntos;
    }
}
