/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estr;

import java.util.ArrayList;
import java.util.List;
public class Prio {
    List<ListaS> lista = null;
    
    public void Prio(){
        lista = new ArrayList<>();
    }
    public void insertar (ListaS x){
        lista.add(x);
    }
    
    public int quitar (){
        int valor = -1;
        int indice = -1;
        
        for(int i=0; i<lista.size();i++){
            if(valor<lista.get(i).contagio){
                valor=lista.get(i).contagio;
                indice= i;
            }
            
        }
        if(indice != -1){
            lista.remove(indice);
            
        }
        return valor;
    }
    
    public boolean empty(){
        if(lista.size() <= 0){
            return true;
        }
        else return false;
    }
}
