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
    private String lugar;
    private int hora;
    private Nodo next;
    Nodo(String lugar,int hora){
        this.lugar = lugar;
        this.hora = hora;
        this.next = null;
    }
    Nodo verNext(){
        return this.next;
    } 
    void agregar (Nodo nd){
        this.next = nd;
    }
    String verInfo(){
        return lugar+" "+hora; 
        
    }

    String getLugar() {
        return lugar;
    }
    int getHora() {
        return hora;
    }
}
