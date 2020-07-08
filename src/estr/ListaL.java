/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

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
  void Positivo (String n){

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
public class ListaL{ 
	public NodeL head;
	
	public ListaL() { 
		head = null; 
	} 
	
	public boolean insert(ListaS item) { 
		boolean inserted = false;
        NodeL newNode = new NodeL(item); 
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
            inserted = true;
        } else {
        	NodeL current = head; 
            while (current.getNext() != null) { 
            	if(current.getData().nombre.equals(item.nombre)) 
            		return inserted;
                current = current.getNext(); 
            } 
            if(!current.getData().nombre.equals(item.nombre))
            	current.setNext(newNode);
        } 
        return inserted;
	} 
	
	public boolean delete(String nombre) { 
		boolean deleted=false; 
		NodeL currNode = head;
		NodeL prev = null;

        if (currNode != null && currNode.getData().nombre == nombre) { 
            head = currNode.getNext();
            return deleted;
        } 
        
        while (currNode != null && currNode.getData().nombre != nombre) { 
            prev = currNode; 
            currNode = currNode.getNext(); 
        }
        
        if (currNode != null) {
            prev.setNext(currNode.getNext()); 
            deleted = true;
        } 

        if (currNode == null)
            deleted = false;
        
        return deleted;
		
	} 
	
	public NodeL find(String data) {
		NodeL current = head;
		while(current != null) {
			if(current.getData().nombre.equals(data))
				return current;
			current = current.getNext();
		}
		return current;
	}
	
	public void print() {  
		NodeL cur = head;
		while(cur != null) {
			System.out.print(cur.getData().nombre); 
			System.out.print(",");
			cur = cur.getNext();
		}
	} 
	
	ListaS ver (int ruta){
		ListaS t = head.getData();
	    for(int i =0;i<ruta;i++){
	    	t = t.verNext();
	    }
	    return t;
	}

}
