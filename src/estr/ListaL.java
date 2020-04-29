/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author David Andrés
 */
public class ListaL {
    public ListaS head;
    public ListaS fin;
    int tam;
    ListaL(){
        head=null;
        tam = 0;
    }
    void add (ListaS s){
        
        if(head == null){
            head = s;
            fin = s;
        }
        else{
            ListaS t = head;
            ListaS n = s;
            n.agregar(t);
            head = n;
            
        }
        tam++;
    }
   ListaS ver (int ruta){
      ListaS t = head;
      for(int i =0;i<ruta;i++){
          t = t.verNext();
      }
      return t;
  }
   void eliminar(String n){
       if(head == fin  && n.equals(head.nombre)){
           head = fin = null;
       }
       else if(n.equals(head.nombre)){
           head = head.verNext();
       }
       else{
           ListaS an,te;
           an = head;
           te = head.verNext();
           while(te != null && te.nombre != n){
               an = an.verNext();
               te = te.verNext();
           }
           if(te != null){
               an.agregar(te.verNext());
               if(te == fin){
                   fin = an;
               }
           }
       }
   }
  ListaS buscar (String n){
      ListaS t = head;
      ListaS g = head;
      int flag = 0;
      int c = 0;
      while (flag == 0){
          c++;
          if (t.nombre.equals(n)){
              g = t;
              flag = 1;
          }
          else {
              t = t.verNext();
          }
      if(c == tam){
          flag = 1;
      }
      }
      return g;
  }
  void guardar (Object o){
      FileOutputStream ficha = null;
      try{
          ficha = new FileOutputStream("base.txt");
          ObjectOutputStream t = new ObjectOutputStream(ficha);
          t.writeObject(o);
      }
      catch(FileNotFoundException ex){
          ex.printStackTrace();
      }
      catch(IOException ex){
          ex.printStackTrace();
          
      }finally{
      try{
      ficha.close();
      }
      catch(IOException es){
          es.printStackTrace();
                  }
      }
  }
}
