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
public class NodoL {
    private Object data;
    private NodoL next;


    NodoL(Object data) {
        this.data = data;
        this.next = null;
    }

    NodoL() {
        this.data = null;
        this.next = null;       
    }

  
    void agregar (NodoL n){
        this.next = n;
    }
    Object getData(){
        return data;
    }
}
