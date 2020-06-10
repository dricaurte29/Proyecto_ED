/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estr;

/**
 *
 * @author David Andrés
 */
public class Nodo {
    private double lon;
    private double lat;
    private int hora;
    private Nodo next;
    Nodo(double lon, double lat ,int hora){
        this.lon = lon;
        this.lat = lat;
        this.hora = hora;
        this.next = null;
    }
    Nodo verNext(){
        return this.next;
    } 
    void agregar (Nodo nd){
        this.next = nd;
    }


    String getLugar() {
        return lat +" "+ lon;
    }
    int getHora() {
        return hora;
    }
}
